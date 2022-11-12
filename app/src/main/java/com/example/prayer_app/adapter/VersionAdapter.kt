package com.example.prayer_app.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prayer_app.databinding.FragmentHistoryBinding
import com.example.prayer_app.databinding.RowBinding
import com.example.prayer_app.model.UserModel
import com.example.prayer_app.model.Version

class VersionAdapter() : RecyclerView.Adapter<VersionAdapter.VersionVH>() {
    private var versionList = emptyList<Version>()
    //    private lateinit var binding: FragmentHistoryBinding
    class VersionVH(val binding: RowBinding) : RecyclerView.ViewHolder(binding.root) {

//        var codeNameTxt: TextView = binding.codeName
//        var versionTxt: TextView = binding.version
//        var apiLevelTxt: TextView = binding.apiLevel
//        var descriptionTxt: TextView = binding.description
//        var linearLayoutRow: LinearLayout = binding.linearLayoutRow
//        var expandable_layout: RelativeLayout = binding.expandableLayout

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionVH {
        return VersionVH(
            RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
//        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
//
//        return VersionVH(view)
    }

    override fun onBindViewHolder(holder: VersionVH, position: Int) {

        holder.binding.codeName.text = versionList[position].codeName
        holder.binding.version.text = versionList[position].version
        holder.binding.apiLevel.text = versionList[position].apiLevel
        holder.binding.description.text = versionList[position].description

        val isExpandable: Boolean = versionList[position].expandable
        holder.binding.expandableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.binding.linearLayoutRow.setOnClickListener {
            val versions = versionList[position]
            versions.expandable = !versions.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return versionList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setll(verser: ArrayList<Version>){
        versionList = verser
        notifyDataSetChanged()
    }

}