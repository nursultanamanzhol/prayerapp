package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.prayer_app.R
import com.example.prayer_app.databinding.FragmentBismillahActivityBinding


class BismillahActivity : Fragment() {

    private lateinit var binding: FragmentBismillahActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBismillahActivityBinding.inflate(inflater, container, false)
        binding.StartBismillah.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_bismillahActivity_to_quranActivity)
        }
        return binding.root
    }

}