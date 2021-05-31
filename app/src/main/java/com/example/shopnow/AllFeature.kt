package com.example.shopnow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopnow.dashoardadapter.FeatureAdapter

class AllFeature : AppCompatActivity() {
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var  featureAdapter : FeatureAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_feature)
        val featuredView = findViewById<RecyclerView>(R.id.featuredRecyclerView)
        gridLayoutManager= GridLayoutManager(this, 2)
        featuredView.layoutManager =gridLayoutManager
        featureAdapter =FeatureAdapter()

    }
}