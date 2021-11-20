package com.muratselcuk.karakterkitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)


        val intent=intent
        val yollanilanIsim=intent.getStringExtra("karakterismi")
        detayTextView.text=yollanilanIsim

        val yollanilanGorselId=intent.getIntExtra("karaktergorseli",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,yollanilanGorselId)
        detayImageView.setImageBitmap(bitmap)

        /*
        val secilen =SingleTon.Secilen
        val bitmap=secilen.secilenGorsel
        detayImageView.setImageBitmap(bitmap)

         */
    }
}
