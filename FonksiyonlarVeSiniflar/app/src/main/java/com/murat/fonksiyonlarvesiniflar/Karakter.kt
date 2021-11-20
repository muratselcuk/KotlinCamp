package com.murat.fonksiyonlarvesiniflar

class Karakter (var isim:String,var yas:Int,var meslek:String) {
    private var sacRengi="Sarı"

    //setter
    fun sacRenginiDegistir(){
        this.sacRengi ="Siyah"
    }

    //getter
    fun sacRenginiAl():String{
        return this.sacRengi
    }

    //access levels
    //private - protected - internal - public (open)

}


/*
class Karakter {

    var isim=""
    var yas=0
    var meslek=""

    //constructor

    constructor(isim:String, yas:Int,meslek:String){
        println("obje oluşturuldu")
        //this
        this.isim=isim
        this.meslek=meslek
        this.yas=yas
    }

}

 */