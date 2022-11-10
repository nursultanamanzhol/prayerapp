package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.prayer_app.R
import com.example.prayer_app.databinding.FragmentMainBinding
import com.example.prayer_app.databinding.FragmentZikirActivityBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(inflater, container, false)


        binding.GetStart.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_mainFragment_to_homeActivity)
        }
//        val nextBtn: Button = view.findViewById(R.id.GetStart)
//        nextBtn.setOnClickListener{
//            val fragment = HomeActivity()// nevigate to second
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
//        }
        return binding.root


    }


}