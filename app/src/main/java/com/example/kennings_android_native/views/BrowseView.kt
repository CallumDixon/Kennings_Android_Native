package com.example.kennings_android_native.views

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.kennings_android_native.ViewModels.BrowseViewModel


@Composable
fun BrowseView(navController: NavController,Title: String, browseViewModel: BrowseViewModel) {

    LaunchedEffect(Unit, block = {
        browseViewModel.getCategories("Categories")
    })

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {

        if(browseViewModel.Loading.value){
            CircularProgressIndicator()
        }
        else{
            CategoryList(categories = browseViewModel.CategoryList)
        }
    }
}

@Composable
fun CategoryList(categories: List<String>) {
    LazyColumn{
        items(categories) { category ->
            Text(text = category)
        }
    }
}