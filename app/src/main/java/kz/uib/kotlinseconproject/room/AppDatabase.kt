package kz.uib.kotlinseconproject.room

import android.content.Context
import android.content.Entity
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kz.uib.kotlinseconproject.Model.CoinPriceInfo

@Database(entities = [CoinPriceInfo::class], version = 1, exportSchema = false)
abstract class AppDatabase:RoomDatabase() {


    companion object{
        private var db: AppDatabase? = null

        private const val DBName = "main.db"
        private val LOCK = Any()
        fun getInstance(context: Context): AppDatabase{
            synchronized(LOCK) {
                db?.let {
                    return it
                }
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    DBName
                ).build()
                db = instance
                return instance

            }
        }
    }



    abstract fun coinPriceInfoDao(): CoinPriceDao
}