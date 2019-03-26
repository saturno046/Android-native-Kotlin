package com.example.saturno046.redesocial

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.saturno046.redesocial.R.layout.activity_cadastro
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_cadastro.*


class CadastroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_cadastro)

        btnCadastra.setOnClickListener {
            cadastrar()
        }

}
    private fun cadastrar () {

        val database = FirebaseDatabase.getInstance()
        val profileRef = database.getReference("profile")

        val profile = Profile(txtName.text.toString(),
                              txtAddress.text.toString())

        val (name, address) = profile

        profileRef.push().setValue(profile)
    }

}
