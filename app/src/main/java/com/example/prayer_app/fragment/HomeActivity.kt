package com.example.prayer_app.fragment

//import android.os.Build.VERSION_CODES.
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.prayer_app.R


class HomeActivity : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home_activity, container, false)
        val quranBtn: Button = view.findViewById(R.id.QuranBtn)
        val tarih: Button = view.findViewById(R.id.Tarih)
        val zikir: Button = view.findViewById(R.id.Zikir)
        val qosymsha: Button = view.findViewById(R.id.Qosymsha)
        quranBtn.setOnClickListener{
            val fragment = BismillahActivity()// nevigate to second
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        tarih.setOnClickListener{
            val fragment = LibraryActivity()// nevigate to second
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        zikir.setOnClickListener{
            val fragment = ZikirActivity()// nevigate to second
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        qosymsha.setOnClickListener{
            val fragment = ZikirActivity()// nevigate to second
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        return view
    }


}