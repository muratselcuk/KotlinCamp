package com.murat.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba Dünya")
        println(5 * 2)
        println(10 + 20)
        var yas = 50
        println(yas * 2)
        yas = 51
        println(yas * 2)

        val x = 10
        val pi = 3

        println(x * yas * pi)

        var kullaniciYasi = 33
        println(kullaniciYasi / 2)

        var islemSonucu = kullaniciYasi * 2
        println(islemSonucu)

        var benimIntegerim: Int

        benimIntegerim = 10

        //long
        var benimLong: Long = 100

        //double 64bit float 32bit
        var benimKesirliSayim = 33.0
        println(benimKesirliSayim / 2.0)

        var benimFloat: Float = 3.0f
        println(benimFloat / 2)

        val benimString = "string örneği"

        println(benimString.capitalize())

        var benimBoolean = false

        println(3<5)
        println(5<3)
        println(5==5)
        println(4!=4)

        var benimNumaram=10
        var benimLongaCevirilenNumaram=benimNumaram.toLong()
        println(benimLongaCevirilenNumaram)

        var kullaniciGirdi="20"
        var kullaniciGirdiInteger=kullaniciGirdi.toInt()
        println(kullaniciGirdiInteger*2)

        val doubleOrnegi= 5.5
        val integerCevirilenDouble=doubleOrnegi.toInt()
        println(integerCevirilenDouble)

        //koleksşyonlar
        //diziler array

        val benimDizim = arrayOf("Murat","Selçuk","Attila","Teoman")

        println(benimDizim[0])
        benimDizim[0]="Nuray"
        println(benimDizim[0])
        println(benimDizim.get(2))
        benimDizim.set(0,"Murat")
        println(benimDizim[0])

        val doubleDizisi= arrayOf(3.5,4.5,5.5,6.5)

        val karisikDizi = arrayOf("Atıl",50,true,45.5)
        println(karisikDizi.get(2))

        //arraylist listeler
        val isimlerimiz= arrayListOf<String>()
        isimlerimiz.add("Murat")
        isimlerimiz.add(0,"Selçuk")
        println(isimlerimiz[0])
        println(isimlerimiz[1])

        val integerArrayList=ArrayList<Int>()
        integerArrayList.add(2)
        integerArrayList.add(500)
        println(integerArrayList.get(1))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Murat")
        karisikArrayList.add(200)
        karisikArrayList.add(true)
        karisikArrayList.add(40.2)

        println(karisikArrayList.get(3))

        val sabit1=10
        val sabit2=20
        val degiskenArrayList= arrayListOf<Int>(sabit1,sabit2)
        println(degiskenArrayList.get(1))

        //set
        val ornekDizi= arrayOf(5,5,10,15,20,20)
        println("index 0: ${ornekDizi[0]}")
        println("index 0: ${ornekDizi[1]}")

        println(ornekDizi.size)

        val benimSet= setOf<Int>(5,5,10,15,20,20)
        println(benimSet.size)

        //forEach
        benimSet.forEach {
            println(it)
        }

        val ornekSet=HashSet<String>()
        ornekSet.add("Murat")
        ornekSet.add("Murat")
        ornekSet.add("Selçuk")

        ornekSet.forEach {
            println(it)
        }

        //Map - HashMap - Sözlük
        //anahtar kelime - değer eşleşmesi (key-value)

        val meyveDizisi= arrayOf("Elma","Muz","Karpuz")
        val kaloriDizisi= arrayOf(100,150,200)

        println("${meyveDizisi[0]} 'nın Kalorisi: ${kaloriDizisi[0]}")

        val meyveKaloriMap= hashMapOf<String,Int>()
        meyveKaloriMap.put("Elma",100)
        meyveKaloriMap.put("Muz",150)
        meyveKaloriMap.put("Karpuz",200)

        println(meyveKaloriMap.get("Muz"))

        val benimHashMap=HashMap<String,String>()
        benimHashMap.put("AnahtarKelime","Değer")
  
        val yeniHashMap= hashMapOf<String,Int>("Murat" to 40, "Selçuk" to 50)
        println(yeniHashMap.get("Murat"))
    }
}
