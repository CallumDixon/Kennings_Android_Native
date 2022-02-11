package com.example.kennings_android_native.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kennings_android_native.ViewModels.BrowseViewModel

@Composable
fun BrowseView(navController: NavController,Title: String, browseViewModel: BrowseViewModel) {

    LaunchedEffect(Unit, block = {
        browseViewModel.getCategories(Title)
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
                CategoryList(categories = browseViewModel.CategoryList, navController = navController)
            }
        }

}

@Composable
fun CategoryList(categories: List<String>, navController: NavController?) {
    LazyColumn(modifier = Modifier.padding(10.dp).height(500.dp).border(width = 1.dp, Color.Red, shape = RoundedCornerShape(10.dp)), verticalArrangement = Arrangement.spacedBy(10.dp)){
        items(categories) { category ->

            Card(modifier = Modifier
                .border(width = 1.dp, Color.Black, shape = RoundedCornerShape(10.dp))
                .padding(all = 1.dp)
                .fillMaxSize()
                .size(height = 50.dp, width = 100.dp)
                .clickable { navController?.navigate("Categories/$category") }
                ,backgroundColor = Color.LightGray
            )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement  = Arrangement.Center,
                ){
                    Text(text = category)
                }
            }
        }
    }
}

@Composable
@Preview
fun CategoryListPreview (){
    CategoryList(categories = listOf("Category1", "Category 2", "Category 3"),null)
}