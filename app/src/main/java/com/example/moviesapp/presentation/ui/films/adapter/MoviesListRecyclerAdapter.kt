package com.example.moviesapp.presentation.ui.films.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.databinding.MoviesListRecyclerItemBinding

class MoviesListRecyclerAdapter(
    val onItemClick:() -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val moviesList = emptyList<String>()

    class ViewHolder(binding:MoviesListRecyclerItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            MoviesListRecyclerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

}