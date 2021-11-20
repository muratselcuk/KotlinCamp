package com.murat.fonksiyonlarvesiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        birinciFonksiyon()

        toplama(10, 20)
        val a = carpma(10, 20)
        textView3.text = "Sonuç${a}"
        button.setOnClickListener {
            var carSonucu = carpma(10, 10)
            textView3.text = "Sonuç: ${carSonucu}"
        }
        karakterOlustur()
        nullGuvenligi()

    }

    fun birinciFonksiyon() {
        println("birinci fonksiyon çalıştırıldı.")
    }

    fun ikinciFonksiyon() {
        birinciFonksiyon()
    }
    //girdi almak parametre sormak

    fun toplama(a: Int, b: Int) {
        textView3.text = "Sonuç: ${a + b}"
    }

    //Çıktı vermek return

    fun carpma(x: Int, y: Int): Int {
        //textView3.text="Sonuç: ${x*y}"
        return x * y
    }
    /*
    fun degistir(view:View){
        val carpmasonucu=carpma(10,30)
        textView3.text="Sonuç: ${carpmasonucu}"
    }

     */
    /*
    fun karakterOlustur(){
        var homer=Karakter()
        homer.isim="homer"
        homer.yas=50
        homer.meslek="Nükleer Güvenlik"

        println(homer.meslek)
    }

     */

    fun karakterOlustur() {
        var homer = Karakter("Homer Simpson", 50, "Nükleer Güvenlik")
        var bart=Karakter("Bart Simpson",15,"Öğrenci")
        println(homer.isim)
        homer.isim="Homer"
        println(homer.isim)
        println(homer.sacRenginiAl())
    }

    fun nullGuvenligi(){
        var benimString:String?=null
        var benimYasim:Int?=null

        if (benimYasim!=null){
            println(benimYasim*5)
        }
        else {
            println("değer null geldi")
        }

        //println(benimYasim!!*5) null ise çöker


        //elvis operatörü
        val benimSonucum=benimYasim?.compareTo(40)?:-40
        println(benimSonucum)
    }
}
