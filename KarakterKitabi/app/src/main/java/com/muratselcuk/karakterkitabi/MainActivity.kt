package com.muratselcuk.karakterkitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //veri
        var karakterListesi=ArrayList<String>()
        karakterListesi.add("Superman")
        karakterListesi.add("Batman")
        karakterListesi.add("Hulk")
        karakterListesi.add("Iron Man")

        //verimsiz bitmap
        /*
        val supermanGorsel=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val batmanGorsel=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val hulkGorsel=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.hulk)
        val ironmanGorsel=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)

        val karakterGorselleri=ArrayList<Bitmap>()
        karakterGorselleri.add(supermanGorsel)
        karakterGorselleri.add(batmanGorsel)
        karakterGorselleri.add(hulkGorsel)
        karakterGorselleri.add(ironmanGorsel)
        */


        //verimli Gorsel

        val supermanGorselId=R.drawable.superman
        val batmanGorselId=R.drawable.batman
        val hulkGorselId=R.drawable.hulk
        val ironmanGorselId=R.drawable.ironman

        var karakterGorselIdleri=ArrayList<Int>()
        karakterGorselIdleri.add(supermanGorselId)
        karakterGorselIdleri.add(batmanGorselId)
        karakterGorselIdleri.add(hulkGorselId)
        karakterGorselIdleri.add(ironmanGorselId)


        //layoutManager
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        //adapter
        val adapter=ListeAdapter(karakterListesi,karakterGorselIdleri)
        recyclerView.adapter=adapter




    }
}
