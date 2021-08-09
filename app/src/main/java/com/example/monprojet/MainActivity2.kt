package com.example.monprojet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val boutttonretour = findViewById<Button>(R.id.r11)
        val boutttonretour1 = findViewById<Button>(R.id.r12)
        val boutttonretour2 = findViewById<Button>(R.id.r13)
        val boutttonretour3 = findViewById<Button>(R.id.r14)





        val monIntent  =  Intent(this,MainActivity::class.java)

        val builder = AlertDialog.Builder(this)
        builder.setTitle("RESTART")
        builder.setMessage("voulez rejouez comme vin-ke ")
        builder.setPositiveButton(" REJOUER ") { dialog, which ->
            Toast.makeText(this,
                " quelle brave type :') ", Toast.LENGTH_SHORT).show()
            startActivity(monIntent)
        }
        builder.setNegativeButton("HELL NO ") { dialog, which ->
            Toast.makeText(this,
                " ah bah si tu va rejouer !", Toast.LENGTH_SHORT).show()
            startActivity(monIntent)
        }

        boutttonretour.setOnClickListener {
            Toast.makeText(this,
                " voyons kevin !", Toast.LENGTH_SHORT).show()
            //startActivity(monIntent)
            builder.show()
        }

        boutttonretour1.setOnClickListener {
            Toast.makeText(this,
                " kevin > einstein  !", Toast.LENGTH_SHORT).show()
            builder.show()

        }

        boutttonretour2.setOnClickListener {
            Toast.makeText(this,
                " oui ! (mais non )", Toast.LENGTH_SHORT).show()
            builder.show()

        }

        boutttonretour3.setOnClickListener {
            Toast.makeText(this,
                " oui! ( mais non) ", Toast.LENGTH_SHORT).show()
            builder.show()

        }

        // ------------------------------------ MON COMPTEUR -------------------
        val compteure = findViewById<TextView>(R.id.compteur)
        var number= intent.getIntExtra("compteur",0)
        if(number == 1 ){
            number +=1
            compteure.text = number.toString()
        }

    }
}