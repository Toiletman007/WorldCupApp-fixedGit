package com.example.worldcupappfixedgit

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.util.zip.Inflater

class MyAdapter(private var activity: Activity, private var items: ArrayList<CountryModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0: Int): Any {
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(posistion: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder

        if (convertView==null){
            val inflator = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflator.inflate(R.layout.list_item_layout, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        val countries = items[posistion]
        viewHolder.txtName?.text = countries.name
        viewHolder.txtCupWin?.text = countries.cupWins
        viewHolder.flagImage?.setImageResource(countries.flagImage)
        return view as View
    }
    private class ViewHolder(row: View?){
        var txtName: TextView? = null
        var txtCupWin: TextView? = null
        var flagImage: ImageView? = null

        init {
            this.txtName = row?.findViewById(R.id.country_name)
            this.txtCupWin = row?.findViewById(R.id.win_count)
            this.flagImage = row?.findViewById(R.id.image_view)
        }
    }

}