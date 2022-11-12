package com.example.prayer_app.fragment

//import android.os.Build.VERSION_CODES.
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.prayer_app.R
import com.example.prayer_app.databinding.FragmentHomeActivityBinding
import com.example.prayer_app.databinding.FragmentMainBinding


class HomeActivity : Fragment() {

    private lateinit var binding: FragmentHomeActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeActivityBinding.inflate(inflater, container, false)
        binding.QuranBtn.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_homeActivity_to_bismillahActivity)
        }
        binding.Zikir.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_homeActivity_to_zikirActivity)
        }

        binding.TatihBtn.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_homeActivity_to_historyFragment)
        }

//        binding.taryh.setOnClickListener {
//            Navigation.findNavController(binding.root)
//                .navigate(R.id.action_homeActivity_to_libraryActivity)
//        }
//        val view = inflater.inflate(R.layout.fragment_home_activity, container, false)
//        val quranBtn: Button = view.findViewById(R.id.QuranBtn)
//        val tarih: Button = view.findViewById(R.id.Tarih)
//        val zikir: Button = view.findViewById(R.id.Zikir)
//        val qosymsha: Button = view.findViewById(R.id.Qosymsha)
//        quranBtn.setOnClickListener{
//            val fragment = BismillahActivity()// nevigate to second
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
//        }
//        tarih.setOnClickListener{
//            val fragment = LibraryActivity()// nevigate to second
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
//        }
//        zikir.setOnClickListener{
//            val fragment = ZikirActivity()// nevigate to second
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
//        }
//        qosymsha.setOnClickListener{
//            val fragment = ZikirActivity()// nevigate to second
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
//        }
        return binding.root
    }


}