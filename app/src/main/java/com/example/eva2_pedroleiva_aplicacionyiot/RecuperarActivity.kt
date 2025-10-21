package com.example.eva2_pedroleiva_aplicacionyiot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RecuperarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)

        val btnRecuperar = findViewById<Button>(R.id.btnRecuperar)
        val btnVolverRec = findViewById<Button>(R.id.btnVolverRec)

        btnRecuperar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Recuperar clave")
                .setMessage("Se ha enviado un enlace a tu correo.")
                .setPositiveButton("OK") { _, _ ->
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
                .show()
        }

        btnVolverRec.setOnClickListener {
            finish()
        }
    }
}