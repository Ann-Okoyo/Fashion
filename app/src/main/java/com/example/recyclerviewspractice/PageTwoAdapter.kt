package com.example.recyclerviewspractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewspractice.databinding.PagetwoBinding

class PageTwoAdapter(private var pageList: List<PageTwoData>):RecyclerView.Adapter<PageTwoAdapter.PageTwoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): PageTwoAdapter.PageTwoViewHolder {
        val binding=PagetwoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  PageTwoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PageTwoViewHolder, position: Int) {
        holder.bind(pageList[position])

    }

    override fun getItemCount(): Int {
        return pageList.size
    }


    inner class PageTwoViewHolder(private val page:PagetwoBinding):RecyclerView.ViewHolder(page.root){
        fun bind (currentPageTwoData: PageTwoData){
            page.apply{
               tvname.text = currentPageTwoData.name
                tvaccount.text=currentPageTwoData.account
                tvphoneno.text=currentPageTwoData.phoneNumber

            }
        }

    }


}