package com.example.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlin1.dataclasses.Place
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin1.adapter.LineAdapter
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var myList: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*val message = intent.getStringExtra(PARAM1_NAME)
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }*/

       myList = ArrayList<Place>()

        //Virá p.e. de WS
        for(i in 0 until 500) {
            myList.add(Place("Country $i", i*500, "Capital $i"))
        }
        recycler_view.adapter = LineAdapter(myList)
        recycler_view.layoutManager = LinearLayoutManager(this)

    }

    fun insert(view: View) {
        myList.add(0, Place("Country XXX", 999, "Capital XXX"))
        recycler_view.adapter?.notifyDataSetChanged()
    }
}