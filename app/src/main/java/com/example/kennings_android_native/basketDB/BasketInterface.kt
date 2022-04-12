package com.example.kennings_android_native.basketDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BasketInterface {

    @Query("SELECT * FROM basket")
    fun fetchAllBasket(): LiveData<List<Basket>>

    @Insert()
    suspend fun insertBasket(basket: Basket)

    @Query("DELETE FROM basket")
    suspend fun deleteBasket()
}