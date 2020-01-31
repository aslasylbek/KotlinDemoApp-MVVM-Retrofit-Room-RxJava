package kz.uib.kotlinseconproject.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kz.uib.kotlinseconproject.Model.CoinPriceInfo


@Dao
interface CoinPriceDao{


    @Query("select * from coin_price_info order by lastUpdate")
    fun getPriceList(): LiveData<List<CoinPriceInfo>>

    @Query("select * from coin_price_info where fromSymbol == :fSym limit 1")
    fun getPriceInfoAboutCoin(fSym: String):LiveData<CoinPriceInfo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceList(priceList: List<CoinPriceInfo>)


}