package com.example.shopnow.data

import android.content.Context
import com.example.shopnow.R

class Datasource(val context: Context) {
    fun getCategoryList():Array<String>{
        return  context.resources.getStringArray(R.array.categories)
    }
}