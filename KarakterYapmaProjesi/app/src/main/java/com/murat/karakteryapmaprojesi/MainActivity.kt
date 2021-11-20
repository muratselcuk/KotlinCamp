package com.murat.karakteryapmaprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(){
        //scope kapsam
        
    }

    fun karakterYap(view:View){
        var isim=isimText.text.toString()
        var yas=yasText.text.toString().toIntOrNull()// sayı girmezse
        var meslek=meslekText.text.toString()

        if (yas== null){
            textView.text="yası doğru giriniz!"
        }
        else {
            val karakter = Karakter(isim, yas, meslek)

            textView.text =
                "isim: ${karakter.isim} Yaş: ${karakter.yas} Merslek: ${karakter.meslek}"
        }
    }

}
