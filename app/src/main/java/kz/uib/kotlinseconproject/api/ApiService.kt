package kz.uib.kotlinseconproject.api

import io.reactivex.Single
import kz.uib.kotlinseconproject.Model.CoinFullData
import kz.uib.kotlinseconproject.Model.CoinInfoResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_LIMIT) limit: Int = 10,
        @Query(QUERY_PARAM_TSYM) sym:String = CURRENCY,
        @Query(QUERY_PARAM_KEY) api_key:String = ""
    ): Single<CoinInfoResponse>


    @GET("pricemultifull")
    fun getFullData(
        @Query(QUERY_PARAM_KEY) api_key: String = "",
        @Query(QUERY_PARAM_FROM_SYMS) fSymbs: String = CURRENCY,
        @Query(QUERY_PARAM_TO_SYMS) toSymbs: String = CURRENCY
    ): Single<CoinFullData>

    companion object{
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_KEY = "api_key"

        private const val QUERY_PARAM_TSYM = "tsym"
        private const val QUERY_PARAM_TO_SYMS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMS = "fsyms"
        private const val CURRENCY = "USD"
    }
}