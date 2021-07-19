package io.footballbetting.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.footballbetting.R
import io.footballbetting.model.DataModel
import kotlinx.android.synthetic.main.row_layout.view.*

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    private var myList = emptyList<DataModel>()

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.userId_txt.text = myList[position].type.toString()
        holder.itemView.id_txt.text = myList[position].auth.toString()
        holder.itemView.title_txt.text = myList[position].sportid
        holder.itemView.body_txt.text = myList[position].oddstype
        holder.itemView.bodyb_txt.text = myList[position].market.toString()
    }

    fun setData(newList: List<DataModel>){
        myList = newList
        notifyDataSetChanged()
    }
}