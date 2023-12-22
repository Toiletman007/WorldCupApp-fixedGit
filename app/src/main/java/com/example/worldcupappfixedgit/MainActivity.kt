package com.example.worldcupappfixedgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapter view: listView
        val listView = findViewById<ListView>(R.id.list_view)
//        adapter
        val adapter = MyAdapter(this, generateData())

        listView?.adapter = adapter
        adapter.notifyDataSetChanged()


    }


    //    Data source
    fun generateData(): ArrayList<CountryModel> {
        val countryList = ArrayList<CountryModel>()

        val country1: CountryModel = CountryModel(
            "Brazil", "5", R.drawable.brazil
        )
        val country2: CountryModel = CountryModel(
            "Britain", "4", R.drawable.britain
        )
        val country3: CountryModel = CountryModel(
            "france", "0", R.drawable.france
        )
        val country4: CountryModel = CountryModel(
            "Spain", "2", R.drawable.spain
        )
        val country5: CountryModel = CountryModel(
            "usa", "1", R.drawable.usa
        )
        val country6: CountryModel = CountryModel(
            "Saudi Arabia", "0", R.drawable.saudi
        )
        val country7: CountryModel = CountryModel(
            "Germany", "999", R.drawable.germany
        )
        countryList.add(country1)
        countryList.add(country2)
        countryList.add(country3)
        countryList.add(country4)
        countryList.add(country5)
        countryList.add(country6)
        countryList.add(country7)

        return countryList
    }
}