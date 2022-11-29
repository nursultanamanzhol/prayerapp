package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.prayer_app.R
import com.example.prayer_app.adapter.UserAdapter
import com.example.prayer_app.databinding.FragmentQuranActivityBinding
import com.example.prayer_app.model.UserModel
import com.example.prayer_app.viewModal.QuranActivityViewModel
import com.example.prayer_app.viewModal.ZikirActivityViewModel


class QuranFragment : Fragment() {
    private lateinit var viewModel: QuranActivityViewModel
    private lateinit var binding: FragmentQuranActivityBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentQuranActivityBinding.inflate(inflater, container, false)
        binding.backQuran.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_quranActivity_to_homeActivity)
        }
        viewModel = ViewModelProvider(this).get(QuranActivityViewModel::class.java)

        initial()

        return binding.root


    }
    fun initial() {
        recyclerView = binding.rvQuran
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setList(viewModel.myUser())
    }

}