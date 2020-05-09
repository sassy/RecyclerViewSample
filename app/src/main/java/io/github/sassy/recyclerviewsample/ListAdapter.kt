package io.github.sassy.recyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter(val datas: List<String>) : RecyclerView.Adapter<ListAdapter.ListItemHolder>() {

    inner class ListItemHolder(val mView: View): RecyclerView.ViewHolder(mView) {
        val textView : TextView = mView.text1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListItemHolder(layout)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {
        holder.textView.text = datas[position]
    }
}