package com.example.myassignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaration The Values

            val ageNumber = findViewById<TextView>(R.id.AgeNumber)
            val btnGenerate = findViewById<Button>(R.id.btnGenerate)
            val btnCancel = findViewById<Button>(R.id.btnCancel)
            val txtResult = findViewById<TextView>(R.id.txtResult)

            btnGenerate.setOnClickListener {

                val age = ageNumber.text.toString().toIntOrNull()
                if (age != null){
                    val result = when (age) {
                        in 0..25 -> "Tupac shakur"
                        in 26..35 -> "Ricky Rick"
                        in 36..41 -> "Kobe Bryant"
                        in 42.. 50 -> "Michael Jackson"
                        in 50..61 -> "Andre Keith Braugher"
                        else -> "other"
                    }
                    txtResult.text = "age: Sage\n${
                        when (txtResult.text) {
                            "Tupac Shakur" -> "Tupac Shakur also known as 2pac and Makaveli was an american rapper. He died in 13 September 1996"
                            "Ricky Rick" -> "Ricky Rick known as Rikhado Makhado, was a South African rapper,singer,song writer. He died 23 February 2022"
                            "Kobe Bryant" -> "Kobe Bryant is an American Professional basketball player. He spent his entire 20 year career with the Los Angeles Lakers in the National Basketball Association. He died 26 January 2020"
                            "Michael Jackson" -> "Michael Jackson was an American singer, nicknamed the king if pop. He is famous for making pop music in the early 2000s. He died 25 June 2009"
                            "Andre Keith Braugher" -> "Andre Keith Braugher was an American actor most commonly known for is role as Detective Frank Pembleton in the drama series Homicide. He died 11 December 2023"
                            else -> "Other celebrities are not most commonly known"
                        }
                    }"
                }else {
                    txtResult.text = "please enter a valid age."
                }
            }
            btnCancel.setOnClickListener {
                btnCancel()
                txtResult.text = ""
            }

    }

}

private fun btnCancel() {
    TODO("Not yet implemented")
}
