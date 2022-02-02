package com.example.kennings_android_native.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.amplifyframework.api.ApiException
import com.amplifyframework.api.graphql.model.ModelQuery
import com.amplifyframework.core.Amplify
import com.amplifyframework.core.category.Category
import com.amplifyframework.core.category.CategoryType
import com.amplifyframework.core.category.CategoryTypeable
import com.amplifyframework.core.model.Model
import com.amplifyframework.datastore.generated.model.AmplifyModelProvider

@Composable
fun BrowseView() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Browse ",
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

/*fun getData() {

    try {
        Amplify.API.query()
        {
            response ->
                response.data.forEach { category ->
                    println(category.name)
                }
        }
    } catch (error: ApiException) {
    }
}*/

@Composable
@Preview
fun BrowseViewPreview() {
    BrowseView()
}