package com.burakturhan.kotlinoop

class Sanatci(var isim: String, val yas: Int, val enstruman: String) : Insan(), Sarki, Dans {

    private var sacRengi = ""
    private var tur = "insan"

    var gozRengi = ""
        private set
        public get

    fun setSacRengi(yeniSacRengi: String) {
        this.sacRengi = yeniSacRengi
    }

    fun getSacrengi(): String {
        return sacRengi
    }

    fun turuYazdir() {
        println("Tür: ${this.tur}")
    }

    fun sarkiSoyle() {
        println("${this.isim} şarkı söyledi.")
    }

    override fun test() {
        // abstract sınıftan gelen abstract fonksiyonun override edilmiş hali
    }

    override fun sarkiSoyleFonksiyonu() {

    }

    override fun dansEtmeFonksiyonu() {
        
    }

    init {
        println("İnit çağırıldı.")
    }
}