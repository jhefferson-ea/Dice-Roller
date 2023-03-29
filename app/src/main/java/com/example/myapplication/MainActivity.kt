package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countUP: Button = findViewById(R.id.count_button)
        rollButton.setOnClickListener { rollDice() }
        countUP.setOnClickListener { countUP() }
    }

    private fun rollDice(){

        /* ------------------------------------------------------------
        exibe um popup com a mensagem desejada no caso "button clicked"
        ---------------------------------------------------------------
        Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT).show()
        ---------------------------------------------------------------
        */

        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()



        /* ------------------------------------------------------------
        desta forma o popup exibe o numero aleatório "randomInt"
        ---------------------------------------------------------------
        Toast.makeText(this, randomInt.toString(),
        Toast.LENGTH_SHORT).show()
        ---------------------------------------------------------------
        */

    }
    private fun countUP(){
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!") {

            resultText.text = "1"
        }else {
            var resultInt = resultText.text.toString().toInt()


        if (resultInt < 6){
            resultInt ++

            resultText.text = resultInt.toString()

            }
        }
    }
}