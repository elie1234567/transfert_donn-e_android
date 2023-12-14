package com.example.transferededonnee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var view: TextView
    private lateinit var affiche: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        view = findViewById(R.id.textView) // Assurez-vous d'avoir le bon ID pour le TextView dans activity_main2.xml
        // Si vous avez un bouton pour fermer l'activité, décommentez la ligne suivante
        affiche = findViewById(R.id.button2)
        val nom = intent.getStringExtra("NOM")
        val prenom = intent.getStringExtra("PRENOM")

        // Afficher les données dans les TextView
        view.text = "Nom: $nom\nPrénom: $prenom"

        // Gérer le clic sur le bouton pour revenir à la première activité
        affiche.setOnClickListener {
            finish() // Fermer la
        }
    }
}