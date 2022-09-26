package com.hakancevik.intentandalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hakancevik.intentandalertdialog.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        // getIntent
        val intent = intent
        val getName = intent.getStringExtra("name")
        val getUsername = intent.getStringExtra("username")


        binding.nameText2.text = "Name: $getName"
        binding.usernameText2.text = "Username: $getUsername"


    }
}