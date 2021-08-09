package com.example.monprojet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boutttonretour = findViewById<Button>(R.id.r1)
        val boutttonretour1 = findViewById<Button>(R.id.r2)
        val boutttonretour2 = findViewById<Button>(R.id.r3)
        val boutttonretour3 = findViewById<Button>(R.id.r4)

        /*val intent = Intent(this@MainActivity,MainActivity2::class.java)
        var number = 1
        intent.putExtra("number","1")
        startActivity(intent)*/




        val monIntent : Intent =  Intent(this,MainActivity2::class.java)

        boutttonretour.setOnClickListener {
            Toast.makeText(this,
                " mauvaise réponse !", Toast.LENGTH_SHORT).show()
            startActivity(monIntent)
        }

        boutttonretour1.setOnClickListener {
            Toast.makeText(this,
                " mauvaise réponse !", Toast.LENGTH_SHORT).show()
            startActivity(monIntent)
        }

        boutttonretour2.setOnClickListener {
            Toast.makeText(this,
                " mauvaise réponse !", Toast.LENGTH_SHORT).show()
            startActivity(monIntent)
        }

        boutttonretour3.setOnClickListener {
            Toast.makeText(this,
                " bien jouer kevin !", Toast.LENGTH_SHORT).show()
            startActivity(monIntent)
        }


    }
}