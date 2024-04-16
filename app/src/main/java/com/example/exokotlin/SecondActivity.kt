package com.example.exokotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nom = intent.getStringExtra("nom")
        val profession = intent.getStringExtra("profession")
        val societe = intent.getStringExtra("societe")

        // Afficher les données dans les TextViews correspondants
        findViewById<TextView>(R.id.textViewNom).text = "Nom: $nom"
        findViewById<TextView>(R.id.textViewProfession).text = "Profession: $profession"
        findViewById<TextView>(R.id.textViewSociete).text = "Société: $societe"


        val button = findViewById<Button>(R.id.buttonConfirm)
        button.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java).apply {
                putExtra("nom", nom)
                putExtra("profession", profession)
                putExtra("societe", societe)
            }
            startActivity(intent)
        }
    }
}