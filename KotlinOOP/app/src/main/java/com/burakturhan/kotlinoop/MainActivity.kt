package com.burakturhan.kotlinoop

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
        val burak = Sanatci("Burak", 30, "gitar")
        println(burak.isim)
        burak.isim = "Burak Turhan"
        println(burak.isim)

        // Encapsulation
        burak.turuYazdir()

        burak.setSacRengi("Sarı")
        var sacRengi = burak.getSacrengi()
        println(sacRengi)

        burak.sarkiSoyle()

        val zeynep = Sanatci("Zeynep", 20, "Bateri")
        zeynep.sarkiSoyle()

        println(zeynep.yas)

        // Inheritance
        val kahraman = Kahraman("superman", "ucmak")
        kahraman.kos()

        val muhtesemKahraman = MuhtesemKahraman("batman", "zenginlik")
        muhtesemKahraman.kos()
        println(muhtesemKahraman.isim)
        muhtesemKahraman.isim = "green lantern"
        muhtesemKahraman.muhtesemFonksiyon()

        // Polymorphism
        // statik polymorphism
        val islemler = Islemler()
        islemler.cikarma(10, 2)
        islemler.cikarma(100, 2, 3)
        islemler.cikarma(100, 2, 3, 2)

        // dinamik polymorphism
        val kedi = Hayvan()
        val kopek = Kopek()
        val ornekDizi = arrayOf(kedi, kopek)
        ornekDizi.forEach {
            it.sesCikar()
        }

        // Abstraction
        // Abstract Class, Interface
        // val insan = Insan()
        burak.test()
    }
}