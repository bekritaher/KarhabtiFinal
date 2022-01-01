package com.example.karhabtifinal.Accounts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.karhabtifinal.R


class Account : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        val button : ImageView = findViewById(R.id.imageView2)
        val button2 : TextView = findViewById(R.id.textView9)

        button.setOnClickListener {
            val intent = Intent(this, Account4::class.java).apply { }
            startActivity(intent)


        }

        button2.setOnClickListener {
            val intent = Intent(this, Account2::class.java).apply { }
            startActivity(intent)


        }



    }

}
