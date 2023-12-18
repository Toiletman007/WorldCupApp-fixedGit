package com.example.worldcupappfixedgit

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

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

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    }


}