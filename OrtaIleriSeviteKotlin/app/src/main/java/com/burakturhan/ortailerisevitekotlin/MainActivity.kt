package com.burakturhan.ortailerisevitekotlin

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

        println("-------Lambda-------")
        yazdigimiYazdir("Burak")
        val yazdigimiYazdirLambda = { verilenString: String -> println(verilenString) }
        yazdigimiYazdirLambda("yazdir test")

        val carpmaIslemiLambda = { a: Int, b: Int -> a * b }
        val sonuc = carpmaIslemiLambda(3, 4)
        println(sonuc)

        val carpmaIkinciVersion: (Int, Int) -> Int = { a, b -> a * b }
        println(carpmaIkinciVersion(5, 3))

        println("-------High Order Functions-------")
        // Filter
        val benimListem = arrayListOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
        /*
        val kucukSayilarListesi = benimListem.filter { num -> num < 10 }
        for (numara in kucukSayilarListesi) {
            println(numara)
        }
         */

        val kucukSayilarYeniListesi = benimListem.filter { it < 10 }
        for (numara in kucukSayilarYeniListesi) {
            println(numara)
        }

        // Map
        val karesiAlinmisSayilar = benimListem.map { it * it }

        for (numara in karesiAlinmisSayilar) {
            println(numara)
        }

        // Map & Filter
        val mapFilterBirArada = benimListem.filter { it < 10 }.map { it * it }
        mapFilterBirArada.forEach { println(it) }

        val sanatci1 = Sanatci("Burak", 30, "Gitar")
        val sanatci2 = Sanatci("Zeynep", 35, "Bateri")
        val sanatci3 = Sanatci("Atlas", 5, "Piyano")
        val sanatcilar = arrayListOf<Sanatci>(sanatci1, sanatci2, sanatci3)

        val otuzdanBuyukSanatcilarEnstrumanlari =
            sanatcilar.filter { it.yas > 30 }.map { it.enstruman }

        otuzdanBuyukSanatcilarEnstrumanlari.forEach { println(it) }

        val otuzikiYasindanKucukSanatcilar = sanatcilar.filter { it.yas < 32 }.map { it.isim }
        otuzikiYasindanKucukSanatcilar.forEach { println(it) }

        // Scope Fonksiyonları
        var benimInteger: Int? = null
        benimInteger = 5
        benimInteger?.let {
            println(it)
        }

        val yeniInteger = benimInteger?.let { it + 1 } ?: 0
        println(yeniInteger)

        // also
        sanatcilar.filter { it.yas > 30 }.also { it.forEach { println(it.isim) } }
    }

    fun yazdigimiYazdir(string: String) {
        println(string)
    }
}