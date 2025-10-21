package com.example.eva2_pedroleiva_aplicacionyiot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val btnVolver = findViewById<Button>(R.id.btnVolverReg)

        btnRegistrar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Registro")
                .setMessage("Cuenta creada exitosamente.")
                .setPositiveButton("OK") { _, _ ->
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
                .show()
        }

        btnVolver.setOnClickListener {
            finish()
        }
    }
}