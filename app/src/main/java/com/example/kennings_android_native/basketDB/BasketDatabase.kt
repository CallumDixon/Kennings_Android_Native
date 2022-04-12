package com.example.kennings_android_native.basketDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Basket::class)], version = 1)
abstract class BasketDatabase: RoomDatabase() {
    abstract fun basketInterface(): BasketInterface

    companion object {
        private var INSTANCE: BasketDatabase? =null

        fun getInstance(context: Context): BasketDatabase{
            synchronized(this){
                var instance = INSTANCE

                if (instance ==  null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        BasketDatabase::class.java,
                        "basket_database"
                    ).fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}