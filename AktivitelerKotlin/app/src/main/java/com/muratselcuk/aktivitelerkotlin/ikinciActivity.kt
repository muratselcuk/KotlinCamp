package com.muratselcuk.aktivitelerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci.*

class ikinciActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci)
        //getIntent
        val intent=intent
        val isimAktarilan=intent.getStringExtra("aktarilanIsim")
        val soyisimAktarilan=intent.getStringExtra("aktarilanSoyisim")

        ikinciActivityText.text="isim: ${isimAktarilan}"
        ikinciActivitySoyisimText.text="Soyisim: ${soyisimAktarilan}"
    }

    fun geriGit(view:View){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}
