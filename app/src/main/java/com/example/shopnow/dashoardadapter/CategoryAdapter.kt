//package com.example.shopnow.dashoardadapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.shopnow.R
//
//class CategoryAdapter(val context: Context, private val photos: ArrayList<String>):RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {
//    /**
//     * Provide a reference to the type of views that you are using
//     * (custom ViewHolder).
//     */
//    class CategoryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val textView: TextView
//
//        init {
//            // Define click listener for the ViewHolder's View.
//            textView = itemView.findViewById(R.id.categoryText)
//        }
//
//    }
//    // Create new views (invoked by the layout manager)
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
//        // Create a new view, which defines the UI of the list item
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.category_card, parent, false)
//
//        return CategoryHolder(view)
//    }
//
//    // Replace the contents of a view (invoked by the layout manager)
//    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
//        // Get element from your dataset at this position and replace the
//        // contents of the view with that element
//        holder.textView.text =photos[position]
//    }
//
//    override fun getItemCount(): Int {
//   return photos.size
//    }
//}
//


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopnow.R
import com.example.shopnow.data.Category

class CategoryAdapter( val categories:List<Category>):
    RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {

    class CategoryHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val categoryNameTextView:TextView =itemView.findViewById(R.id.categoryText)
        val card:CardView =itemView.findViewById(R.id.category_card)
        val catgImg:ImageView =itemView.findViewById(R.id.category_image_view)
        fun bind(categoryName:String,categoryColor:Int,categoryImage:Int){
            categoryNameTextView.text =categoryName
            card.foreground= itemView.context.resources.getDrawable(categoryColor)


            catgImg.setImageDrawable(itemView.context.resources.getDrawable(categoryImage))

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.CategoryHolder {
        // Create a new view, which defines the UI of the list item
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.category_card,parent,false)
        return  CategoryHolder(view);
    }

    override fun onBindViewHolder(holder: CategoryAdapter.CategoryHolder, position: Int) {
      holder.bind(categories[position].categoryName, categories[position].categoryColor,categories[position].categoryImage)
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}


