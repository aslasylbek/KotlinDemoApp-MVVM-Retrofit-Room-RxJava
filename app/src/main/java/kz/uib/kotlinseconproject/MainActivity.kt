package kz.uib.kotlinseconproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    private lateinit var viewModel: CoinViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider.AndroidViewModelFactory(application).create(CoinViewModel::class.java)


        viewModel.loadData()

        viewModel.priceList.observe(this, Observer {
            Log.e("View", "Activity$it")
        })


    }
}
