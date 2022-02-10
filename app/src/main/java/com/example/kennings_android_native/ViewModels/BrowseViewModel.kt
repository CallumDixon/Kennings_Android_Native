package com.example.kennings_android_native.ViewModels

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amplifyframework.api.ApiException
import com.amplifyframework.api.graphql.model.ModelQuery
import com.amplifyframework.datastore.generated.model.Category
import com.amplifyframework.kotlin.core.Amplify
import kotlinx.coroutines.launch

class BrowseViewModel: ViewModel() {

    public val CategoryList = mutableStateListOf<String>()
    public val Loading = mutableStateOf(true)

    fun getCategories(title: String) {

        viewModelScope.launch {
            try{
                CategoryList.addAll(
                Amplify.API.query(
                    ModelQuery.list(Category::class.java, Category.PARENT.eq(title)))
                    .data.items.map { it.name })

                Loading.value = false
            }
            catch (e: ApiException){

            }
        }
    }
}