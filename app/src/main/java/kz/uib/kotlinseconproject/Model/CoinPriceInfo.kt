package kz.uib.kotlinseconproject.Model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


@Entity(tableName = "coin_price_info")
data class CoinPriceInfo (
    @SerializedName("MARKET")
    @Expose
    val market: String? = null,
    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    val fromSymbol: String,
    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String? = null,
    @SerializedName("FLAGS")
    @Expose
    val flags: String? = null,
    @SerializedName("PRICE")
    @Expose
    val price: Double? = null,
    @SerializedName("LASTUPDATE")
    @Expose
    val lastUpdate: Int? = null,
    @SerializedName("MEDIAN")
    @Expose
    val median: Double? = null,
    @SerializedName("LASTVOLUME")
    @Expose
    val lastVolume: Double? = null,
    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastVolumeTo: Double? = null,
    @SerializedName("LASTTRADEID")
    @Expose
    val lastTradeId: String? = null,
    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeDay: Double? = null,
    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumeDayTo: Double? = null,
    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24Hour: Double? = null,
    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24HourTo: Double? = null,
    @SerializedName("OPENDAY")
    @Expose
    val openDay: Double? = null,
    @SerializedName("HIGHDAY")
    @Expose
    val highDay: Double? = null,
    @SerializedName("LOWDAY")
    @Expose
    val lowDay: Double? = null,
    @SerializedName("OPEN24HOUR")
    @Expose
    val open24Hour: Double? = null,
    @SerializedName("HIGH24HOUR")
    @Expose
    val high24Hour: Double? = null,
    @SerializedName("LOW24HOUR")
    @Expose
    val low24Hour: Double? = null,
    @SerializedName("LASTMARKET")
    @Expose
    val lastMarket: String? = null,
    @SerializedName("VOLUMEHOUR")
    @Expose
    val volumeHour: Double? = null,
    @SerializedName("VOLUMEHOURTO")
    @Expose
    val volumeHourTo: Double? = null,
    @SerializedName("OPENHOUR")
    @Expose
    val openHour: Double? = null,
    @SerializedName("HIGHHOUR")
    @Expose
    val highHour: Double? = null,
    @SerializedName("LOWHOUR")
    @Expose
    val lowHour: Double? = null,
    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val tOPTIERVOLUME24HOUR: Double? = null,
    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val tOPTIERVOLUME24HOURTO: Double? = null,
    @SerializedName("CHANGE24HOUR")
    @Expose
    val cHANGE24HOUR: Double? = null,
    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val cHANGEPCT24HOUR: Double? = null,
    @SerializedName("CHANGEDAY")
    @Expose
    val cHANGEDAY: Double? = null,
    @SerializedName("CHANGEPCTDAY")
    @Expose
    val cHANGEPCTDAY: Double? = null,
    @SerializedName("CHANGEHOUR")
    @Expose
    val cHANGEHOUR: Double? = null,
    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val cHANGEPCTHOUR: Double? = null,
    @SerializedName("SUPPLY")
    @Expose
    val sUPPLY: Int? = null,
    @SerializedName("MKTCAP")
    @Expose
    val mKTCAP: Int? = null,
    @SerializedName("TOTALVOLUME24H")
    @Expose
    val tOTALVOLUME24H: Double? = null,
    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val tOTALVOLUME24HTO: Double? = null,
    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val tOTALTOPTIERVOLUME24H: Double? = null,
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val tOTALTOPTIERVOLUME24HTO: Double? = null,
    @SerializedName("IMAGEURL")
    @Expose
    val imageUrl: String? = null,
    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversionType: String? = null,
    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversationSymbol: String? = null

    )