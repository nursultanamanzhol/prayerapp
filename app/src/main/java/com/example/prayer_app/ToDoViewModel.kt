package com.example.prayer_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Button
import android.widget.EditText
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.prayer_app.adapter.RecyclerAdapter
import com.example.prayer_app.model.NicePlace

class ToDoViewModel : Fragment() {
    private var viewManager = LinearLayoutManager(this)
    private lateinit var viewModel: ToDoViewModel
    private lateinit var mainrecycler: RecyclerView
    private lateinit var but: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainrecycler = findViewById(R.id.recycler)
        val application = requireNotNull(this).application
//        val factory = ToDoViewModelFactory()
        viewModel = ViewModelProvider(this).get(ToDoViewModel::class.java)
        but = findViewById(R.id.button)
        but.setOnClickListener {
            addData()
        }

        initialiseAdapter()
    }
    private fun initialiseAdapter(){
        mainrecycler.layoutManager = viewManager
        observeData()
    }

    fun observeData(){
       viewModel.lst.observe(this, Observer{
            Log.i("data",it.toString())
            mainrecycler.adapter= RecyclerAdapter(viewModel, it, this)
        })
    }


    fun addData(){
        var txtplce = findViewById<EditText>(R.id.titletxt)
        var title=txtplce.text.toString()
        if(title.isNullOrBlank()){
            Toast.makeText(this,"Enter value!",Toast.LENGTH_LONG).show()
        }else{
            var blog= NicePlace(title, "ff")
            viewModel.addData(blog)
            txtplce.text.clear()
            mainrecycler.adapter?.notifyDataSetChanged()
        }

    }
}