package com.example.kennings_android_native.ViewModels

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.amplifyframework.api.ApiException
import com.amplifyframework.api.graphql.model.ModelQuery
import com.amplifyframework.datastore.generated.model.Category
import com.amplifyframework.kotlin.core.Amplify
import kotlinx.coroutines.launch

class BrowseViewModel(): ViewModel() {

    private val _CategoryList = mutableStateListOf<String>()
    public val Loading = mutableStateOf(true)

    val CategoryList: List<String>
        get() = _CategoryList


    fun getCategories(title: String) {

        viewModelScope.launch {
            try{
                _CategoryList.clear()
                _CategoryList.addAll(
                Amplify.API.query(

                    ModelQuery.list(Category::class.java, Category.PARENT.eq(title)))
                    .data.items.sortedBy { it.order }.map { it.name })

                Loading.value = false
            }
            catch (e: ApiException){

            }
        }
    }
}