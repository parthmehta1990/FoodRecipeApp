package com.example.foodrecipeapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.foodrecipeapp.databinding.CardviewRecipeBinding

class RecipeAdapter(var context:Context,var list:ArrayList<Recipe>):RecyclerView.Adapter<RecipeAdapter.ViewHolder>(){

    // Inflating Layout and ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeAdapter.ViewHolder {
        val binding: CardviewRecipeBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.cardview_recipe, parent, false)
        return RecipeAdapter.ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    // Bind data
    override fun onBindViewHolder(holder: RecipeAdapter.ViewHolder, position: Int) {
        holder.bind(list.get(position))

        holder.binding
    }

    // Creating ViewHolder
    class ViewHolder(val binding: CardviewRecipeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            //binding.setVariable(BR.user, data)
            binding.cardData= data as Recipe?
            //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }

    }
}