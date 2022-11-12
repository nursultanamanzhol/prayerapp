package com.example.prayer_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prayer_app.adapter.VersionAdapter
import com.example.prayer_app.databinding.FragmentHistoryBinding
import com.example.prayer_app.model.Version
import com.example.prayer_app.R

class HistoryFragment : Fragment() {
//    val versionList = ArrayList<Version>()


    private lateinit var binding: FragmentHistoryBinding
    private lateinit var viewModel: HistoryViewModel
    lateinit var adapter: VersionAdapter
    lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
//        binding.backQuran.setOnClickListener {
//            Navigation.findNavController(binding.root)
//                .navigate(R.id.action_quranActivity_to_homeActivity)
//        }
//        initial()

        setRecyclerView()
        return binding.root


//        return view
    }


    fun myUser(): ArrayList<Version> {
        val userList = ArrayList<Version>()

        val user = Version(
            "Фатиха сүресі", "Ә’узу биллаһи минаш-шайтанир-ражим \n" +
                    "Бисмилләәһир-рахмаанир-рахиим\n" +
                    "«Әлхамду лилләһи раббил-’аләмиин, әр-рахмаанир-рахиим, мәәлики иәумид-диин, ийәкә на’буду уа ийәәкә нәста’иин, иһдинас-сираатал-мустақиим, сираатал-ләзина ән’амта ’аләйһим, ғайрил-мағдууби ’аләйһим уәладдааал-лиин»",
        "Amanzhol","Nursultan")
        userList.add(user)

        val user1 = Version(
            "Фатиха сүресі", "Ә’узу биллаһи минаш-шайтанир-ражим \n" +
                    "Бисмилләәһир-рахмаанир-рахиим\n" +
                    "«Әлхамду лилләһи раббил-’аләмиин, әр-рахмаанир-рахиим, мәәлики иәумид-диин, ийәкә на’буду уа ийәәкә нәста’иин, иһдинас-сираатал-мустақиим, сираатал-ләзина ән’амта ’аләйһим, ғайрил-мағдууби ’аләйһим уәладдааал-лиин»",
            "Amanzhol","Nursultan")
        userList.add(user1)
//        val user1 = UserModel(
//            "Асыр сүресі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Уәл’аср, иннәл инсәәнә ләфи хуср, илләлләзинә әәмәну уа амилус-саалихати уа тауасау билхаққи уа тауаасау биссабр»"
//        )
//        userList.add(user1)
//        val user2 = UserModel(
//            "Фил сүресі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Әләм тәра кәйфа фа’алә раббука биасхаабил фиил, әләм иаж’ал кәйдаһум фи тадлиил, уа әрсәлә ’аләйһим тайран әбәбиил, тәрмииһим бихижааратим мин сижжиил, фәжә’алаһум кә’асфим-мә’куул»"
//        )
//        userList.add(user2)
//        val user3 = UserModel(
//            "Кәусәр сүресі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Иннәә ә’тайнакәл кәусәр, фасалли лираббика уәнхар, инна шәниәкә һуәл әбтәр»"
//        )
//        userList.add(user3)
//        val user4 = UserModel(
//            "Ықылас сүресі", "Бисмилләәһир-рахмаанир-рахим\n" +
//                    "«Қул һуаллаһу ахад, Аллаһус-самад, ләм иәлид уә ләм иуләд, уә ләм иәкул-ләһу куфуан ахад»"
//        )
//        userList.add(user4)
//        val user5 = UserModel(
//            "Фалақ сүресі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Қул ә’узу бираббил-фәлақ, мин шәрри мәә халақ, уа мин шарри ғаасиқин изә уақаб, уа мин шаррин-нәффәәсәәти фил-’уқад, уа мин шарри хәәсидин изәә хәсад»"
//        )
//        userList.add(user5)
//        val user6 = UserModel(
//            "Нас сүресі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Қул ә’узу бирраббин-нәәс, мәликин-нәәс, иләәһин-нәәс, мин шәррил-уәсуәәсил-ханнәс, әлләзи иуасуису фи судуурин-нәәс, минәл-жиннәти уәннәәс»"
//        )
//        userList.add(user6)
//
//
//        val user7 = UserModel(
//            "Аятул-Күрсі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Аллаһу ләә иләәһә илләә һуәл-Хайюл-Қайюм, ләә тәхузуһу синәту уә ләә нәум, ләһу мәә фис-сәмәәуәәти уә мәә фил-ард, мән зәлләзии яшфа’у ’индаһу иллә би-изниһ, иа’ламу мәә бәйнә әйдиһим уә мәә халфаһум, уә ләә юхитууна бишәййм-мин ’илмиһи илләә бимәә шәә, уаси’а курсиюһус-сәмәуәти уәл-ард, уә ләә иәудуһу хифзуһумә уә һуәл-’Алиюл-′Азиим»"
//        )
//        userList.add(user7)
//
//        val user8 = UserModel(
//            "Кафирун сүресі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Қул иәә әииуһәл кәфируун, ләә ә’буду мә тә’будун, уәләә әнтум ’абидуна мәә а’буд, уа ләә әнә ’абидум мә’бәдтум, уә ләә әнтум ’абидуна мәә а’буд, ләкум диинукум уәлиадин»"
//        )
//        userList.add(user7)
//
//        val user9 = UserModel(
//            "Насыр сүресі", "Бисмилләәһир-рахмаанир-рахиим\n" +
//                    "«Изә жәә насруллаһи уәл фатх, уа раәйтәннәсә иадхулуна фи динилләһи әфуәжә, фәсәббих бихамди раббикә уастағфирһ, иннаһу кәәнә тәууәәбә»"
//        )
//        userList.add(user9)

        return userList

    }

    private fun setRecyclerView() {

        recyclerView = binding.recycleView
        adapter = VersionAdapter()
        recyclerView.adapter = adapter
        adapter.setll(myUser())
//        val versionList = ArrayList<Version>()
//        val versionAdapter = VersionAdapter(versionList)
//        binding.recycleView.adapter = versionAdapter
//        binding.recycleView.setHasFixedSize(true)


    }


}