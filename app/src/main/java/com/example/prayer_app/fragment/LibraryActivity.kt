package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.prayer_app.R
import com.example.prayer_app.databinding.FragmentLibraryActivityBinding


class LibraryActivity : Fragment() {

    private lateinit var binding: FragmentLibraryActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentLibraryActivityBinding.inflate(inflater, container, false)
        binding.backLibrary.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_libraryActivity_to_homeActivity)


        }
        return binding.root
    }

}