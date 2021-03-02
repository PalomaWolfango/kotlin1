package com.example.kotlin1

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "nome"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.d("****TAG", "onCreate")
        //Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show()
    }

    fun button1(view: View) {
        var edit1 = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(edit1.text)
    }

    fun button2(view: View) {
        var edit1 = findViewById<EditText>(R.id.editTextTextPersonName)

        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, edit1.text.toString())
        }
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.create_new -> {
                Toast.makeText(this, "create_new", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao2 -> {
                Toast.makeText(this, "opcao2", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao3 -> {
                Toast.makeText(this, "opcao3", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao4 -> {
                Toast.makeText(this, "opcao4", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /*override fun onPause() {
        super.onPause()
        Log.d("****TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("****TAG", "onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("****TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("****TAG", "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("****TAG", "onDestroy")
    }*/
}