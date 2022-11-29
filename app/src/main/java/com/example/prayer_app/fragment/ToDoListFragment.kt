package com.example.prayer_app.fragment


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
//For resource
import com.example.prayer_app.adapter.RecyclerAdapter
import com.example.prayer_app.databinding.FragmentToDoListBinding
import com.example.prayer_app.model.NicePlace
import com.example.prayer_app.viewModal.MainViewModelFactory
import com.example.prayer_app.viewModal.ToDoListViewModel

class ToDoListFragment : Fragment() {
    private lateinit var binding: FragmentToDoListBinding

    //    private var viewManager = LinearLayoutManager(this)
    private lateinit var viewModel: ToDoListViewModel
    lateinit var mainrecycler: RecyclerView
    lateinit var adapter: RecyclerAdapter
    private lateinit var but: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentToDoListBinding.inflate(inflater, container, false)
        mainrecycler = binding.recycler
//        val application = requireNotNull(this).application
        val factory = MainViewModelFactory()
        viewModel = ViewModelProvider(this).get(ToDoListViewModel::class.java)
        but = binding.button
        but.setOnClickListener {
            addData()
        }

        initialiseAdapter()
        return binding.root
    }

    private fun initialiseAdapter() {
//        mainrecycler.layoutManager = viewManager
        observeData()
    }

    @SuppressLint("FragmentLiveDataObserve")
    fun observeData() {
        viewModel.lst.observe(viewLifecycleOwner, Observer {
            Log.i("data", it.toString())
            mainrecycler.adapter = RecyclerAdapter(viewModel, it, this)
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addData() {
        var txtplce = binding.titletxt
        var title = txtplce.text.toString()
        if (title.isNullOrBlank()) {
//            Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show()
//            Toast.makeText(this, "Enter value!", Toast.LENGTH_LONG).show()
        } else {
            var blog = NicePlace(title, "ff")
            viewModel.add(blog)
            txtplce.text.clear()
            mainrecycler.adapter?.notifyDataSetChanged()
        }

    }
}