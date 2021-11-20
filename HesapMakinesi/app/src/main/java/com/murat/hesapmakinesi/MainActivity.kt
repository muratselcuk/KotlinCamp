package com.murat.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var ilkSayi : Int? = null
    var ikinciSayi: Int? = null
    var sonuc: Int?= null

    fun topla(view:View){
        ilkSayi = editText.text.toString().toIntOrNull()
        ikinciSayi=editText2.text.toString().toIntOrNull()
        if(ilkSayi==null || ikinciSayi==null){
            textView.text="sayı girmeyi unutmayın"
        }
            else{
            var sonuc= ilkSayi!! + ikinciSayi!!
            textView.text="Sonuç: ${sonuc}"
        }


    }

    fun cikarma(view: View){
        ilkSayi = editText.text.toString().toIntOrNull()
        ikinciSayi=editText2.text.toString().toIntOrNull()
        if(ilkSayi==null || ikinciSayi==null){
            textView.text="sayı girmeyi unutmayın"
        }
        else{
            var sonuc= ilkSayi!! - ikinciSayi!!
            textView.text="Sonuç: ${sonuc}"
        }


    }

    fun carpma(view: View){
        ilkSayi = editText.text.toString().toIntOrNull()
        ikinciSayi=editText2.text.toString().toIntOrNull()
        if(ilkSayi==null || ikinciSayi==null){
            textView.text="sayı girmeyi unutmayın"
        }
        else{
            var sonuc= ilkSayi!! * ikinciSayi!!
            textView.text="Sonuç: ${sonuc}"
        }


    }

    fun bolme(view: View){
        ilkSayi = editText.text.toString().toIntOrNull()
        ikinciSayi=editText2.text.toString().toIntOrNull()
        if(ilkSayi==null || ikinciSayi==null){
            textView.text="sayı girmeyi unutmayın"
        }
        else{
            var sonuc= ilkSayi!! / ikinciSayi!!
            textView.text="Sonuç: ${sonuc}"
        }


    }
}
