package com.burakturhan.kotlinoop

class Kopek : Hayvan() {
    fun havla() {
        println("Kopek havladı")
        super.sesCikar()
    }

    override fun sesCikar() {
        println("Kopek ses çıkardı.")
    }
}