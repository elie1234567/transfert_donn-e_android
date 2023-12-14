package com.example.transferededonnee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var nom: EditText
    private lateinit var prenom: EditText
    private lateinit var affiche: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nom = findViewById(R.id.editTextText)
        prenom = findViewById(R.id.editTextText2)
        affiche = findViewById(R.id.button)
        affiche.setOnClickListener {
            val nom = nom.text.toString()
            val prenom = prenom.text.toString()

            // Créer l'intention d'ouvrir la deuxième activité
            val intent = Intent(this, MainActivity2::class.java)

            // Passer les données à la deuxième activité
            intent.putExtra("NOM", nom)
            intent.putExtra("PRENOM", prenom)

            // Démarrer la deuxième activité
            startActivity(intent)
    }
}
}