package com.example.usandointent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnTela01: Button
    private lateinit var btnTela02: Button
    private lateinit var btnTela03: Button
    private lateinit var btnSair : Button
    private lateinit var textMenu : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            textMenu = findViewById(R.id.txtMenu)
            btnTela01 = findViewById(R.id.btnTela01)
            btnTela02 = findViewById(R.id.btnTela02)
            btnTela03 = findViewById(R.id.btnTela03)
            btnSair = findViewById(R.id.btnSair)

            btnTela01.setOnClickListener {
                val intent = Intent(this, Tela1::class.java)
                startActivity(intent)
            }
            btnTela02.setOnClickListener {
                val intent = Intent(this, Tela02::class.java)
                startActivity(intent)
            }
            btnTela03.setOnClickListener {
                val intent = Intent(this, Tela03::class.java)
                startActivity(intent)
            }
            btnSair.setOnClickListener {
                finish()
            }
            }
        }
