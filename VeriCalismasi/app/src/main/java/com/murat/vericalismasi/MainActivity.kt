package com.murat.vericalismasi

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences:SharedPreferences
    var sharedPreferencesYas:Int? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // sharedpreferences
        //verileri telefonda xmlde kaydet

        sharedPreferences=this.getSharedPreferences("murat.vericalismasi",Context.MODE_PRIVATE)
        //sharedPreferences.edit().putString("anahtarkelime","deger").apply()
       // var alinanveri=sharedPreferences.getString("anahtarkelime","default")
        //textView.text="yas: ${alinanveri}"
        sharedPreferencesYas=sharedPreferences.getInt("yasAnahtarKelime",-1)
        if(sharedPreferencesYas!=-1){
            //veriler kaydolmuş demektir.
            textView.text="Yaş ${sharedPreferencesYas}"
        } else {
            //kayıt edilmiş bir yaş yok
            textView.text="Yaş: "
        }

    }
    fun kaydet(view: View){
        val yas=editText.text.toString().toIntOrNull()
        if(yas != null){
            textView.text="Yaş: ${yas}"
            sharedPreferences.edit().putInt("yasAnahtarKelime",yas).apply()

        }
    }

    fun sil(view: View){
        sharedPreferencesYas=sharedPreferences.getInt("yasAnahtarKelime",-1)
        if(sharedPreferencesYas!=-1){
            textView.text="Yaş: "
            sharedPreferences.edit().remove("yasAnahtarKelime").apply()
        }


    }

}
