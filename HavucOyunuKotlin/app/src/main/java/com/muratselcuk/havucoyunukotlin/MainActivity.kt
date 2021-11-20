package com.muratselcuk.havucoyunukotlin

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var skor=0
    var gorselListesi=ArrayList<ImageView>()
    var runnable:Runnable= Runnable {  }
    var handler=Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gorselListesi.add(imageView)
        gorselListesi.add(imageView2)
        gorselListesi.add(imageView3)
        gorselListesi.add(imageView4)
        gorselListesi.add(imageView5)
        gorselListesi.add(imageView6)
        gorselListesi.add(imageView7)
        gorselListesi.add(imageView8)
        gorselListesi.add(imageView9)





        //ContDownTimer
        object : CountDownTimer(15000,1000){
            override fun onFinish() {
                zamanText.text="Zaman: 0"

                handler.removeCallbacks(runnable)
                for (gorsel in gorselListesi){
                    gorsel.visibility=View.INVISIBLE
                }
                //AlertDialog
                var uyariMesaji=AlertDialog.Builder(this@MainActivity)
                uyariMesaji.setTitle("Oyun Bitti")
                uyariMesaji.setMessage("Tekrar oynamak ister misin??")
                uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
                    //oyunu baştan başlatacağız.
                    val intent=getIntent()
                    finish()
                    startActivity(intent)
                })
                uyariMesaji.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialog, which ->
                    //oyun bitiyor
                    Toast.makeText(this@MainActivity,"Oyun Bitti",Toast.LENGTH_LONG).show()
                })
                uyariMesaji.show()
            }

            override fun onTick(millisUntilFinished: Long) {
                zamanText.text="Zaman: ${millisUntilFinished/1000}"
            }

        }.start()
        havucuGizle()
    }


    fun skoruArttir(view:View){
        skor=skor+1
        skorText.text="Skor: ${skor}"
    }

    fun havucuGizle(){

        //Runable
        //Handler
        runnable= object :Runnable{
            override fun run() {
                for (gorsel in gorselListesi){
                    gorsel.visibility=View.INVISIBLE
                }

                //random
                val random= Random()
                val rastgeleSayi=random.nextInt(9)
                gorselListesi[rastgeleSayi].visibility=View.VISIBLE

                handler.postDelayed(this,500)

            }

        }

        handler.post(runnable)




    }
}
