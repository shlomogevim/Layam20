package com.sg.layam20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_mad.view.*

class MadAdapter (val items:ArrayList<Mad>,val clickListener: OnMadItemClickListener): RecyclerView.Adapter<MadAdapter.MadViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MadViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_mad,parent,false)
         return MadViewHolder(view)
    }

    override fun onBindViewHolder(holder: MadViewHolder, position: Int) {
        holder.initialize(items[position],clickListener)
    }

    override fun getItemCount()=items.size

    class MadViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var madName=itemView.madName
        var madLogo=itemView.madImage
        fun initialize(item:Mad,action:OnMadItemClickListener){
            madName.text=item.name
            madLogo.setImageResource(item.logo)
            itemView.setOnClickListener {
                action.onItemClick(item,adapterPosition)
            }
        }
    }
}

interface OnMadItemClickListener {
    fun onItemClick(item:Mad,position:Int)

}