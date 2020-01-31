package kz.uib.kotlinseconproject.Model

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinFullData (
    @SerializedName("RAW")
    @Expose
    val coinPriceInfoJson: JsonObject? = null
)