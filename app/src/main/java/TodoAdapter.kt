//package com.example.prayer_app.activities
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.prayer_app.R
//
//
//class TodoAdapter(
//    var todos: List<Todo>
//) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
//    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
//        return TodoViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
//        holder.itemView.apply {
//            R.id.tvTitle.text = todos[position].title
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return todos.size
//    }
//
//
//}