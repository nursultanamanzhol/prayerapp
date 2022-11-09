package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.prayer_app.R
import org.w3c.dom.Text



class ZikirActivity : Fragment() {
    var countZ=0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        // hw8
        val view = inflater.inflate(R.layout.fragment_zikir_activity, container, false)
        var zkCount: Text = view.findViewById(R.id.zkCount)
        val btnCount: Button = view.findViewById(R.id.btnCount)
        zkCount.text=countZ.toString()

        btnCount.setOnClickListener{
            ++countZ
            println("clicked button 2")
            Toast.makeText(view?.context, "Button Clicked", Toast.LENGTH_LONG).show()
            zkCount.text=countZ.toString()

        }
        //hw8
        return view
      //  return inflater.inflate(R.layout.fragment_zikir_activity, container, false)
    }



}