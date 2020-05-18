package com.example.foodrecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.foodrecipeapp.databinding.ActivityRecipeBinding

class RecipeActivity : AppCompatActivity() {

    lateinit var mActivityRecipeBinding:ActivityRecipeBinding
    lateinit var recipy:Recipe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityRecipeBinding=DataBindingUtil.setContentView(this,R.layout.activity_recipe)



        mActivityRecipeBinding.recipyData=recipy
    }
}
