package com.example.shopnow.dashoardadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopnow.R
import com.example.shopnow.data.BestSelling

class BestSellingAdapter(val bestSelling:ArrayList<BestSelling>): RecyclerView.Adapter<BestSellingAdapter.BestSellingViewHolder>() {
    class BestSellingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemPrice :TextView = itemView.findViewById(R.id.productPrice)
        val itemName :TextView = itemView.findViewById(R.id.prouctName)
        val itemImage : ImageView = itemView.findViewById(R.id.productImage)
        fun bind(price:String,name:String,image:Int){
            itemPrice.text = price
            itemName.text= name
            itemImage.setImageDrawable(itemView.context.resources.getDrawable(image))

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellingViewHolder {
        var view = LayoutInflater.from(parent.context)
                .inflate(R.layout.best_selling,parent,false)
        return  BestSellingViewHolder(view)

    }



    override fun onBindViewHolder(holder: BestSellingViewHolder, position: Int) {
        holder.bind(bestSelling[position].itemPrice,bestSelling[position].itemName,bestSelling[position].itemImage)
    }
    override fun getItemCount(): Int {
       return bestSelling.size
    }
}