package com.burakturhan.kotlintemelleri

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("Merhaba Dünya!")
        println("İkinci satır")
        // yorum satırı
        println(5 * 2)
        println(10 / 5)
        println(5 / 2)

        // Kotlinde veri tipleri ve değişkenler

        // Integer - Tam Sayı
        println("---------Integer---------")
        var x = 10
        println(x)
        println(x * 20)

        x = 30
        println(x * 20)

        var y = 5
        println(y)
        println(x + y)

        // implicit
        val z = 20
        println(z * 50)

        // explicit
        var ornek : Long = 10
        print(ornek * 10)
        val ornekShort : Short = 20
        val ornekByte : Byte = 15
        val ornekInt : Int = 30
        println(ornekByte * ornekShort)

        //Double - Float - Kesirli Sayılar
        println("---------Float---------")
        val ornekInteger = 4
        val pi = 3.14
        println(2 * pi)

        println(5.0 / 2.0)

        val ornekDouble = 3.0
        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat : Float = 2.25f
        println(ornekFloat * 2)

        // Unsigned
        println("---------Unsigned---------")
        val unsignedByte : UByte = 10u
        val unsignedShort : UShort = 10u
        val unsignedInt : UInt = 10u
        val unsignedLong : ULong = 10u

        // String - Metinler
        println("---------String---------")

        val benimString = "Benim String'im"

        val ornekString : String = "ornek"

        val isim = "Burak"
        println(isim.uppercase())

        val soyisim = "Turhan"

        println(isim + " " + soyisim)

        val yas = "15"
        val ornekDeger = "20"
        println(yas + ornekDeger)

        val benimStr : String
        benimStr = "benim stringim" // initialize

        // Conversion
        val yasInt = yas.toInt()
        println(yasInt * 20)

        // Boolean
        println("---------Boolean---------")

        var benimBool : Boolean = true
        benimBool = false

        println(3 > 5)
        println(3 < 5)
        println(4 == 4)

        val kullaniciYas = "35"
        println(kullaniciYas.toInt() > 18)

        println(4 > 3 && 3 > 5)
        println(4 > 3 || 3 > 5)

        // Data Structures - Veri Yapıları

        // Array - Diziler
        println("---------Array---------")

        val benimDizim = arrayOf("burak", "turhan", "zeynep", "fatih", "mehmet")

        println(benimDizim[0])
        println(benimDizim[1])
        println(benimDizim.last())

        benimDizim[1] = "Sam"
        println(benimDizim[1])
        println(benimDizim.get(3))

        val numaraDizisi = arrayOf(1, 10, 20, 15, 2, 4)
        println(numaraDizisi[3] * 10)

        val karisikDizi = arrayOf(10, 3.14, 20, "burak", false, true)
        println(karisikDizi[2])

        // ArrayList
        println("---------ArrayList---------")

        val isimListesi = arrayListOf("burak", "turhan", "zeynep")
        println(isimListesi[0])
        println(isimListesi[1])
        println(isimListesi[2])

        println(isimListesi.size)
        isimListesi.add("mahmut")
        println(isimListesi.get(3))
        isimListesi[3] = "mehmet"
        println(isimListesi.get(3))
        // isimListesi.removeAt(3)

        val numaraListesi = arrayListOf<Int>(10, 20, 30)
        val digerOrnekListe = ArrayList<Int>()

        numaraListesi.add(10)
        numaraListesi.add(20)
        numaraListesi.add(30)

        digerOrnekListe.add(40)
        digerOrnekListe.add(50)
        digerOrnekListe.add(60)

        println(numaraListesi[1] * digerOrnekListe[2])

        val karisikListe = arrayListOf(10, 3.14, "burak", true)
        val karisikBosListe = arrayListOf<Any>()

        karisikBosListe.add(10)
        karisikBosListe.add("burak")
        karisikBosListe.add(false)

        println(karisikBosListe.get(0))

        // Set
        println("---------Set---------")

        val ornekDizi = arrayOf(10, 10, 10, 10, 20, 30, 40)
        println(ornekDizi.get(0))
        println(ornekDizi.get(1))

        val ornekSet = setOf(10, 10, 10, 10, 20, 30, 40)
        println(ornekSet.size)

        ornekSet.forEach {
            println(it)
        }

        val bosSetOrnegi = HashSet<String>()
        bosSetOrnegi.add("Burak")
        bosSetOrnegi.add("Burak")
        bosSetOrnegi.add("Burak")
        bosSetOrnegi.add("Turhan")
        bosSetOrnegi.add("Zeynep")

        bosSetOrnegi.forEach {
            println(it)
        }

        val ornekTekilSet = ornekDizi.toHashSet()
        ornekTekilSet.forEach {
            println(it)
        }

        // Map (Key - Value)
        println("---------Map---------")
        val yemekDizisi = arrayListOf("Elma", "Armut", "Karpuz")
        val kaloriDizisi = arrayListOf(100, 150, 200)

        println("${yemekDizisi[0]} yiyeceğinin kalorisi ${kaloriDizisi[0]}")

        val yemekKaloriMapi = hashMapOf<String, Int>()
        yemekKaloriMapi.put("Elma", 100)
        yemekKaloriMapi.put("Armut", 150)
        yemekKaloriMapi.put("Karpuz", 200)

        println(yemekKaloriMapi["Elma"])
        println(yemekKaloriMapi.get("Armut"))
        yemekKaloriMapi.put("Elma", 300)
        println(yemekKaloriMapi.get("Elma"))

        val ornekHashMap = HashMap<String, String>()
        ornekHashMap.put("Burak", "Turhan")
        ornekHashMap.put("adc", "def")

        // if
        println("---------if---------")

        println(3 > 5)

        var sayi = 10
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        println(10 % 3)

        val skor = 60

        if(skor < 10){
            println("oyunu kaybettiniz")
        }else if(skor >= 10 && skor < 20){
            println("fena olmayan bir skor aldınız")
        }else if(skor >= 20 && skor < 30){
            println("güzel bir skor elde ettiniz")
        }else{
            println("çok güzel bir skor elde ettiniz")
        }

        // When
        println("---------When---------")

        val notRakam = 0
        var notString = ""

        when(notRakam){
            0 -> notString = "Geçersiz Not"
            1 -> notString = "Zayıf"
            2 -> notString = "Kötü"
            3 -> notString = "Orta"
            4 -> notString = "İyi"
            5 -> notString = "Pek iyi"
            else -> notString = "Böyle bir not bilmiyoruz"
        }

        println(notString)

        // while
        println("---------while---------")

        var j = 0

        while(j < 10){
            println(j)
            j++
        }

        println("döngü bitti")

        // for
        println("---------for---------")

        val baskaDizi = arrayListOf(5, 10, 15, 20, 25, 30)
        println(baskaDizi[0] / 5 * 3)
        println(baskaDizi[1] / 5 * 3)

        for(numara in baskaDizi){
            println(numara / 5 * 3)
        }
        println("döngü bitti")

        for(num in 0..9){
            println(num * 10)
        }

        val benimStringDizim = ArrayList<String>()
        benimStringDizim.add("Burak")
        benimStringDizim.add("Ali")
        benimStringDizim.add("Zeynep")

        for (kelime in benimStringDizim){
            println(kelime.uppercase())
        }

        benimStringDizim.forEach { kelime ->
            println(kelime.uppercase())
        }
    }
}