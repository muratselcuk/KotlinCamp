package com.muratselcuk.aktivitelerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate çağrıldı")
    }
    //Activity LifeCycle - Aktivite yaşam döngüsü
    override fun onStart() {
        super.onStart()
        println("onStart çağrıldı")

    }

    override fun onResume() {
        super.onResume()
        println("onResume çağrıldı")

    }

    override fun onPause() {
        super.onPause()
        println("onPause çağrıldı")

    }

    override fun onStop() {
        super.onStop()
        println("onStop çağrıldı")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çağrıldı")

    }

    fun ileri(view: View){
        //Intent
        val isim=isimText.text.toString()
        val soyisim=soyisimText.text.toString()
        val intent= Intent(this,ikinciActivity::class.java)
        intent.putExtra("aktarilanIsim",isim)
        intent.putExtra("aktarilanSoyisim",soyisim)
        startActivity(intent)
        finish()
    }
}

