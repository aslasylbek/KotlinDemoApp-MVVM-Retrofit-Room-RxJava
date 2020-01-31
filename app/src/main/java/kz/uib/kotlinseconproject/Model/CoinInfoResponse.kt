package kz.uib.kotlinseconproject.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoResponse (
    @SerializedName("Message")
    @Expose
    val message: String? = null,
    @SerializedName("Type")
    @Expose
    val type: Int? = null,
    @SerializedName("Data")
    @Expose
    val data: List<DatumInfo>? = null,
    @SerializedName("HasWarning")
    @Expose
    val hasWarning: Boolean? = null
)