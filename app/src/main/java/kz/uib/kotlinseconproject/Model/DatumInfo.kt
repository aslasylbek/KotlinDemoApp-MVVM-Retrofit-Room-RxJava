package kz.uib.kotlinseconproject.Model

import android.view.Display
import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DatumInfo (
    @SerializedName("CoinInfo")
    @Expose
    val coinInfo: CoinInfo? = null

)