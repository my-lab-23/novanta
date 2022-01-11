package com.example.novanta

object MyEstrazione {

    private val numeri: MutableList<Int> = (1..90).shuffled()
                        as MutableList<Int>

    private val estratti = mutableListOf<Int>()

    private var n = 90

    fun estrai(): String {
        if(n <= 0) { return "N" }
        //
        val rand = (0 until n).random()
        val estratto = numeri[rand]

        numeri.removeAt(rand)
        estratti.add(estratto)
        n -= 1

        return estratto.toString()
    }

    fun estratti(): String {
        if(n <= 0) { return "Tutti estratti" }
        //
        estratti.sort()

        return estratti.toString()
    }
}
