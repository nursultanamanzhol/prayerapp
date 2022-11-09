package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.prayer_app.R


class BismillahActivity : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bismillah_activity, container, false)
        val nextBtn: Button = view.findViewById(R.id.StartBismillah)
        nextBtn.setOnClickListener{
            val fragment = QuranActivity()// nevigate to second
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        return view
    }


}