package com.muratselcuk.uyarimesajkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Context

        //applicationContext -> App context
        //this, this@mainActicity -> Aktivitenin Context

        Toast.makeText(this,"Hoşgeldiniz",Toast.LENGTH_LONG).show()
    }

    fun kaydet(view: View){
        //Alert Dialog, Uyarı Mesajı, Dialog
        val uyari=AlertDialog.Builder(this)
        uyari.setTitle("Kaydet")
        uyari.setMessage("Kaydetmek istediğine emin misin?")
        //Lambda gösterimi Lambda Expression
        uyari.setPositiveButton("evet",DialogInterface.OnClickListener { dialog, which ->
            //kullanıcı evete tıkladı
            Toast.makeText(this,"Kayıt Edildi",Toast.LENGTH_LONG).show()

        })

        uyari.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialog, which ->
            //Kullanıcı Hayıra tıkladı
            Toast.makeText(this,"Kayıt Edilmedi",Toast.LENGTH_LONG).show()

        })
        uyari.show()
    }
}
