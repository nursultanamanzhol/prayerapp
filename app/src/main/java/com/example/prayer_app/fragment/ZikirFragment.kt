package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.prayer_app.R
import com.example.prayer_app.viewModal.ZikirActivityViewModel
import com.example.prayer_app.databinding.FragmentZikirActivityBinding


class ZikirFragment : Fragment() {
    var countZ = 0
    private lateinit var viewModel: ZikirActivityViewModel

    private lateinit var binding: FragmentZikirActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        // hw8
        binding = FragmentZikirActivityBinding.inflate(inflater,container, false)

        binding.backZikir.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_zikirActivity_to_homeActivity)
        }

        viewModel = ViewModelProvider(this).get(ZikirActivityViewModel::class.java)

        viewModel.countZ.observe(viewLifecycleOwner, Observer {
            binding.zkCount.text = it.toString()
        })
        binding.btnCount.setOnClickListener {

            viewModel.updateCountZ()

            println("clicked button 1")
            Toast.makeText(view?.context, "Button Clicked", Toast.LENGTH_LONG).show()
        }
        binding.restart.setOnClickListener {

            viewModel.restartCountZ()

            println("clicked button 1")
            Toast.makeText(view?.context, "restart Clicked", Toast.LENGTH_LONG).show()
        }



        return binding.root
    }


}