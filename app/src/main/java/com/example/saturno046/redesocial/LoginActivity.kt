package com.example.saturno046.redesocial

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{
            login(txtEmail.text.toString(),
                    txtPassword.text.toString(),
                    this@LoginActivity)
        }

        btnRecupera.setOnClickListener {
            recupera()
        }

    }

    private fun login(email: String, password: String, activity: Activity){

        val mAuth = FirebaseAuth.getInstance()

        mAuth?.signInWithEmailAndPassword(email,password)

                ?.addOnCompleteListener(activity) { task ->

                    if (task.isSuccessful){
                        val intentcadastr = Intent(this, CadastroActivity::class.java)
                        startActivity(intentcadastr)
                    }else{
                        Toast.makeText(applicationContext, "Authentication failed",
                                Toast.LENGTH_SHORT).show()
                    }

                }

    }
    private fun recupera(){
        val intentrec = Intent(this, RecuperaActivity::class.java)
        startActivity(intentrec)
    }
}