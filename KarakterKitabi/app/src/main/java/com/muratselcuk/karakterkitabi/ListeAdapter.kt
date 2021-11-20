package com.muratselcuk.karakterkitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class ListeAdapter(val karakterListesi:ArrayList<String>,val karakterGorselleri:ArrayList<Int>):RecyclerView.Adapter<ListeAdapter.KarakterKitabiVH>() {

    //ViewHolder
    class KarakterKitabiVH(view: View) :RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KarakterKitabiVH {
        //LayoutInflater
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return KarakterKitabiVH(view)
    }

    override fun getItemCount(): Int {
        return karakterListesi.size
    }

    override fun onBindViewHolder(holder: KarakterKitabiVH, position: Int) {
        holder.itemView.itemRowText.text=karakterListesi[position]

        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,DetayActivity::class.java)
            intent.putExtra("karakterismi",karakterListesi[position])
            intent.putExtra("karaktergorseli",karakterGorselleri[position])
            //val singleTon=SingleTon.Secilen
            //singleTon.secilenGorsel=karakterGorselleri[position]
            holder.itemView.context.startActivity(intent)
        }
    }
}