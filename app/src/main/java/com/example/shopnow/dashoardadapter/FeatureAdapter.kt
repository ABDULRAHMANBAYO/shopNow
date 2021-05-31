package com.example.shopnow.dashoardadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopnow.R
import com.example.shopnow.data.Featured

class FeatureAdapter(val item:ArrayList<Featured>,val limit:Int): RecyclerView.Adapter<FeatureAdapter.FeaturedViewHolder>() {


    class FeaturedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productImage:ImageView=itemView.findViewById(R.id.productImage);
        var productPrice:TextView =itemView.findViewById(R.id.productPrice);
        var productName:TextView =itemView.findViewById(R.id.prouctName);

        fun  bind(image:Int,price:String,name:String){
            productImage.setImageDrawable(itemView.context.resources.getDrawable(image))
            productPrice.text = price
            productName.text =name
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureAdapter.FeaturedViewHolder {
        val item = LayoutInflater.from(parent.context)
                .inflate(R.layout.featured,parent,false)
        return FeaturedViewHolder(item)
    }

    override fun onBindViewHolder(holder: FeaturedViewHolder, position: Int) {
        holder.bind(item[position].itemImage,item[position].itemPrice,item[position].itemName)
    }

    override fun getItemCount(): Int {
        return item.size
    }


}