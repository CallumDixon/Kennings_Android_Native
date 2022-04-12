package com.example.kennings_android_native.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.kennings_android_native.ViewModels.BasketContext

@Composable
fun BasketView(navController: NavController) {

    val basketItems by BasketContext.current.currentBasket.observeAsState(listOf())



    val test = listOf<String>()

    Scaffold( topBar = { TopAppBar { Text("Basket") } } ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            LazyColumn(){
                items(basketItems){ item ->
                    Text(text = item.name.toString())
                }
            }
        }
    }
}