package com.kaka.mykeyakiapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveTentang: Button = findViewById(R.id.btn_tentang)
        btnMoveTentang.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
           R.id.btn_tentang -> {
               val moveIntent = Intent(this@MainActivity, TentangAku::class.java)
               startActivity(moveIntent)
           }
        }
    }
}

