package com.example.kennings_android_native.basketDB

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BasketRepository(private val basketInterface: BasketInterface) {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun insertBasket(basket: Basket){
        coroutineScope.launch(Dispatchers.IO){
            basketInterface.insertBasket(basket)
        }
    }

    fun deleteBasket(){
        coroutineScope.launch(Dispatchers.IO){
            basketInterface.deleteBasket()
        }
    }

    fun queryBasket(){
        coroutineScope.launch(Dispatchers.IO){
            basketInterface.fetchAllBasket()
        }
    }
}