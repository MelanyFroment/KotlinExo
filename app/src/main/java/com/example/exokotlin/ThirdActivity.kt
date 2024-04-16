package com.example.exokotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val nom = intent.getStringExtra("nom")
        val profession = intent.getStringExtra("profession")
        val societe = intent.getStringExtra("societe")

        val badgeTextView = findViewById<TextView>(R.id.textViewBadge)
        badgeTextView.text = "Nom: $nom\nProfession: $profession\nSociété: $societe"
    }
}