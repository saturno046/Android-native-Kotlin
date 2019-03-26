package com.example.saturno046.redesocial

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_recupera.*


class RecuperaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recupera)

        btnEnviar.setOnClickListener {
            recupera(txtEmail.text.toString(), this@RecuperaActivity)
        }
    }

    private fun recupera(email: String, activity: Activity) {

        val mAuth = FirebaseAuth.getInstance()

        mAuth.sendPasswordResetEmail(email)

                ?.addOnCompleteListener(activity) { task ->

                    if (task.isSuccessful) {
                        Toast.makeText(applicationContext, "Email enviado", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "Email nao cadastrado", Toast.LENGTH_SHORT).show()
                    }

                }
        }
}

