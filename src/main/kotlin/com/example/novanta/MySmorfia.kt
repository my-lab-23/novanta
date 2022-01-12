package com.example.novanta

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.File

object MySmorfia {

    private val path = "./smorfia.csv"

    private fun readCsv(): List<List<String>> {
        val file = File(path)
        return csvReader().readAll(file)
    }

    fun readSmorfia(n: Int): String {
        val rows = this.readCsv()
        return rows[n-1][1]
    }
}
