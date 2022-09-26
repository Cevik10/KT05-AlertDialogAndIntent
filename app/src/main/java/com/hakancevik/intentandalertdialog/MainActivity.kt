package com.hakancevik.intentandalertdialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.hakancevik.intentandalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }


    fun nextButton(view: View) {


        // Alert Dialog
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Next")
        alertDialog.setMessage("Are You Sure?")

        alertDialog.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(applicationContext, "Next", Toast.LENGTH_LONG).show()

            // Intent to another activity
            val name = binding.nameText.text.toString()
            val username = binding.usernameText.text.toString()

            val intent = Intent(applicationContext, SecondActivity::class.java)

            intent.putExtra("name", name)
            intent.putExtra("username", username)

            startActivity(intent)

        }

        alertDialog.setNegativeButton("No") { dialog, which ->
            Toast.makeText(applicationContext, "Canceled!", Toast.LENGTH_LONG).show()
        }

        alertDialog.show()


    }

    override fun onStart() {
        super.onStart()
        print("called: on start")
    }

    override fun onResume() {
        super.onResume()
        print("called: on resume")
    }

    override fun onPause() {
        super.onPause()
        print("called: on pause")
    }

    override fun onStop() {
        super.onStop()
        print("called: on stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("called: on destroy")
    }

}