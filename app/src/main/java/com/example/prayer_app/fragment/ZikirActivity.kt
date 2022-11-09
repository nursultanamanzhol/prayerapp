package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.prayer_app.R
import com.example.prayer_app.ZikirActivityViewModel
import com.example.prayer_app.databinding.FragmentZikirActivityBinding
import org.w3c.dom.Text


class ZikirActivity : Fragment() {
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

        viewModel = ViewModelProvider(this).get(ZikirActivityViewModel::class.java)

        viewModel.countZ.observe(viewLifecycleOwner, Observer {
            binding.zkCount.text = it.toString()
        })
        binding.btnCount.setOnClickListener {

            viewModel.updateCountZ()

            println("clicked button 1")
            Toast.makeText(view?.context, "Button Clicked", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }


}