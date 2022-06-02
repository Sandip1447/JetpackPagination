package com.freecodecloud.jetpackpagination.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.freecodecloud.jetpackpagination.data.model.CharacterData
import com.freecodecloud.jetpackpagination.databinding.CharacterListBinding


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
class CharacterListAdapter :
    PagingDataAdapter<CharacterData, RecyclerView.ViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK =
            object : DiffUtil.ItemCallback<CharacterData>() {

                override fun areItemsTheSame(
                    oldItem: CharacterData,
                    newItem: CharacterData
                ): Boolean {
                    return oldItem.name == newItem.name
                }

                override fun areContentsTheSame(
                    oldItem: CharacterData,
                    newItem: CharacterData
                ): Boolean {
                    return oldItem.name == newItem.name && oldItem.species == newItem.species
                }

            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return CharacterViewHolder(
            CharacterListBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false
            )

        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is CharacterViewHolder -> {
                holder.bind(getItem(position))
            }
        }
    }


    class CharacterViewHolder
    constructor(
        val binding: CharacterListBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CharacterData?) = with(binding.root) {

            binding.apply {
                txtName.text = item?.name
                txtDescription.text = item?.species
            }
        }

    }
}