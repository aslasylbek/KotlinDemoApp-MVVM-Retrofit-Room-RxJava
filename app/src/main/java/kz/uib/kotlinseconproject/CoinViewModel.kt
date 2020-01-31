package kz.uib.kotlinseconproject

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kz.uib.kotlinseconproject.Model.CoinFullData
import kz.uib.kotlinseconproject.Model.CoinPriceInfo
import kz.uib.kotlinseconproject.api.ApiFactory
import kz.uib.kotlinseconproject.room.AppDatabase

class CoinViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getInstance(application)

    private val compositeDisposable = CompositeDisposable()

    val priceList = db.coinPriceInfoDao().getPriceList()

    fun loadData(){
        compositeDisposable.add(
        ApiFactory.apiService.getTopCoinsInfo()
            .map {  it.data?.map { it.coinInfo?.fullName }?.joinToString(",") }
            .flatMap { ApiFactory.apiService.getFullData(fSymbs = it) }
            .map { getCoinFullDataFromRaw(it) }
            .subscribeOn(Schedulers.io())
            .subscribe({
                db.coinPriceInfoDao().insertPriceList(it)
                Log.e("ViewModel", it.toString())
            },{
                Log.e("ViewModel", it.message)
            }))
    }


    private fun getCoinFullDataFromRaw(coinFullData: CoinFullData):List<CoinPriceInfo>{
        val result = ArrayList<CoinPriceInfo>()
        val jsonObject = coinFullData.coinPriceInfoJson ?: return result

        val keySets = jsonObject.keySet()

        for (key in keySets){
            val currencyJson = jsonObject.getAsJsonObject(key)
            val currencyKeySets = currencyJson.keySet()
            for (currencyKey in currencyKeySets){
                val priceInfo = Gson().fromJson(
                    currencyJson.getAsJsonObject(currencyKey),
                    CoinPriceInfo::class.java)
                result.add(priceInfo)
            }
        }
        return result


    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

}