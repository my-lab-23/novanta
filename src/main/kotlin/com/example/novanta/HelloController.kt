package com.example.novanta

import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var numeroEstratto: Label
    @FXML
    private lateinit var numeriEstratti: Label

    @FXML
    private fun onHelloButtonClick() {
        numeroEstratto.text = MyEstrazione.estrai()
        numeriEstratti.text = MyEstrazione.estratti()
    }
}
