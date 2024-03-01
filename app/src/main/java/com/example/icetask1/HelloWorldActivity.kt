package com.example.icetask1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloWorldActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        helloTextView = findViewById(R.id.helloTextView)

        findViewById<Button>(R.id.buttonEnglish).setOnClickListener(this)
        findViewById<Button>(R.id.buttonFrench).setOnClickListener(this)
        findViewById<Button>(R.id.buttonSpanish).setOnClickListener(this)
        findViewById<Button>(R.id.buttonGerman).setOnClickListener(this)
        findViewById<Button>(R.id.buttonItalian).setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.buttonEnglish -> helloTextView.text = "Hello World!"
            R.id.buttonFrench -> helloTextView.text = "Bonjour le monde!"
            R.id.buttonSpanish -> helloTextView.text = "¡Hola Mundo!"
            R.id.buttonGerman -> helloTextView.text = "Hallo Welt!"
            R.id.buttonItalian -> helloTextView.text = "Ciao Mondo!"
        }
    }
}
