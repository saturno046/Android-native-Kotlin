package com.example.saturno046.redesocial

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

//import kotlinx.android.synthetic.main.activity_splash

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val background = object  : Thread(){
            override fun run() {
                try {

                    Thread.sleep(5000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)

                }catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
