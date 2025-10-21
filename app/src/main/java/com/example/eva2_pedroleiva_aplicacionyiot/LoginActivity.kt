package com.example.eva2_pedroleiva_aplicacionyiot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvRecuperar = findViewById<TextView>(R.id.tvRecuperar)
        val tvRegistrar = findViewById<TextView>(R.id.tvRegistrar)

        btnLogin.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Inicio de sesión")
                .setMessage("Bienvenido, usuario")
                .setPositiveButton("OK", null)
                .show()
        }

        tvRecuperar.setOnClickListener {
            startActivity(Intent(this, RecuperarActivity::class.java))
        }

        tvRegistrar.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }
    }
}