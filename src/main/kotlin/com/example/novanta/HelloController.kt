package com.example.novanta

//import com.example.myos.MyOS
import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var numeroEstratto: Label
    @FXML
    private lateinit var numeriEstratti: Label
    @FXML
    private lateinit var smorfia: Label

    @FXML
    private fun onHelloButtonClick() {
        val estratto = MyEstrazione.estrai()
        numeroEstratto.text = estratto
        numeriEstratti.text = MyEstrazione.estratti()
        try {
            smorfia.text = MySmorfia.readSmorfia(estratto.toInt())
        } catch (e: NumberFormatException) {
            smorfia.text = "Tutti estratti"
        }

        //
        //val out = MyOS.ls()
        //println(out)
    }
}
