package com.example.kennings_android_native.ViewModels


import android.app.Application
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kennings_android_native.basketDB.Basket
import com.example.kennings_android_native.basketDB.BasketDatabase
import com.example.kennings_android_native.basketDB.BasketRepository

class BasketViewModel(application: Application): ViewModel() {

    val currentBasket:LiveData<List<Basket>>
    private val basketRepo: BasketRepository
    private val basketDB = BasketDatabase.getInstance(application)
    private val basketInterface = basketDB.basketInterface()


    init {
        basketRepo = BasketRepository(basketInterface)
        currentBasket = fetchAllBasket()
    }

    private fun fetchAllBasket():LiveData<List<Basket>>{
        return basketInterface.fetchAllBasket()
    }
}

val BasketContext = compositionLocalOf { BasketViewModel(Application()) }