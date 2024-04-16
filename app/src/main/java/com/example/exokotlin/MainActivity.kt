package com.example.exokotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val editTextNom = findViewById<EditText>(R.id.editTextNom)
        val editTextProfession = findViewById<EditText>(R.id.editTextProfession)
        val editTextSociete = findViewById<EditText>(R.id.editTextSociete)

        val button = findViewById<Button>(R.id.btnSubmit)
        button.setOnClickListener{
            val nom = editTextNom.text.toString()
            val profession = editTextProfession.text.toString()
            val societe = editTextSociete.text.toString()

            // Créer un intent pour passer à SecondActivity avec les données
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("nom", nom)
                putExtra("profession", profession)
                putExtra("societe", societe)
            }

            startActivity(intent)
        }



    }
}