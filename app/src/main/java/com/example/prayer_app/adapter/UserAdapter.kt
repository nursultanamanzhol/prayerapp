package com.example.prayer_app.adapter

import android.annotation.SuppressLint
import android.graphics.ColorSpace.Model
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prayer_app.R
import com.example.prayer_app.databinding.ItemUserLayoutBinding
import com.example.prayer_app.model.UserModel

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private var userList = emptyList<UserModel>()

    class UserViewHolder(val binding: ItemUserLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemUserLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.binding.tvLastName.text = userList[position].lastName
        holder.binding.tvFirstName.text = userList[position].firstName
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<UserModel>){
        userList = list
        notifyDataSetChanged()
    }
}