package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.prayer_app.R
import com.example.prayer_app.databinding.FragmentLibraryActivityBinding
import com.example.prayer_app.databinding.FragmentNamazActivityBinding


class NamazFragment : Fragment() {

private lateinit var binding: FragmentNamazActivityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentNamazActivityBinding.inflate(inflater, container, false)
        binding.backNamaz.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_namazActivity_to_mainFragment)


        }
        return binding.root

    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//
//    }
}