package com.example.shopnow

import CategoryAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopnow.dashoardadapter.BestSellingAdapter
import com.example.shopnow.dashoardadapter.FeatureAdapter
import com.example.shopnow.data.BestSelling
import com.example.shopnow.data.Category
import com.example.shopnow.data.Featured


class Dashboard : AppCompatActivity() {
    private val limit = 10
    private var categoryList=ArrayList<Category>()
    private var featureList=ArrayList<Featured>()
    private var bestSellingList=ArrayList<BestSelling>()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var featuredLayoutManager: LinearLayoutManager
    private lateinit var bestSellingLayoutManager: LinearLayoutManager

    private lateinit var  categoryAdapter :CategoryAdapter
    private lateinit var  featureAdapter :FeatureAdapter
    private lateinit var  bestSellingAdapter : BestSellingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
//        //Get categories
//        val categoryList= ArrayList<Category>()

        //Get recycler layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val featuredView = findViewById<RecyclerView>(R.id.featuredRecyclerView)
        val bestSellingView = findViewById<RecyclerView>(R.id.bestSellingview)

        //Set recycler layout to LinearLayout
        linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        featuredLayoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        bestSellingLayoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = linearLayoutManager
        featuredView.layoutManager =featuredLayoutManager
        bestSellingView.layoutManager = bestSellingLayoutManager


        //Initialize categoryAdapter
         categoryAdapter = CategoryAdapter(categoryList)
        featureAdapter =FeatureAdapter(featureList)
        bestSellingAdapter = BestSellingAdapter(bestSellingList)
//        val categoryAdapter = CategoryAdapter(this,getItemsList())

        recyclerView.adapter=categoryAdapter
        featuredView.adapter=featureAdapter
        bestSellingView.adapter= bestSellingAdapter

        supportActionBar?.hide()
        prepareCategoriesData()
        prepareFeatureData()
        prepareBestSellignData()


    }
//   private  fun getItemsList(): ArrayList<String> {
//        val list = ArrayList<String>()
//
//        for(i in 1..3){
//            list.add("Item $i")
//        }
//
//        return list
//    }
private fun prepareCategoriesData() {
    var category = Category("Women", R.drawable.women, R.color.womenColor)
    categoryList.add(category)

    category = Category("Men", R.drawable.men,  R.color.menColor)
    categoryList.add(category)

    category = Category("Kids", R.drawable.kids,  R.color.kidColor)
    categoryList.add(category)

    categoryAdapter!!.notifyDataSetChanged()
}
    private fun prepareFeatureData() {
        var feature = Featured("Women T shirt", "$30.00", R.drawable.womentshirt)
        featureList.add(feature)

        feature = Featured("Men T-shirt", "$30.00", R.drawable.mentshirt)
        featureList.add(feature)

        feature = Featured("Kids-Shirt", "$50.00",  R.drawable.womentshirttwo)
        featureList.add(feature)

        featureAdapter!!.notifyDataSetChanged()
    }
    private fun prepareBestSellignData() {
        var bestSelling = BestSelling("Polo T shirt", "$60.00", R.drawable.womentshirttwo)
        bestSellingList.add(bestSelling)

        bestSelling = BestSelling("Hermes T-shirt", "$30.00", R.drawable.men)
        bestSellingList.add(bestSelling)

        bestSelling = BestSelling("Gucci-Shirt", "$50.00",  R.drawable.womentshirt)
        bestSellingList.add(bestSelling)

        bestSellingAdapter!!.notifyDataSetChanged()
    }
}