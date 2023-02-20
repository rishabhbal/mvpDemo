package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), contract.view {

    var textview: TextView? = null
    var editText: EditText? = null
    var btn: Button? = null

    var presenter: presenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textView)
        editText = findViewById(R.id.editTextTextPersonName)
        btn = findViewById(R.id.button)

        presenter = presenter(model(), this)

        btn?.setOnClickListener{
            presenter?.onSave(editText?.text.toString())
        }
    }

    override fun setTextView(name: ArrayList<String>?) {
        if (name != null) {
                textview?.setText(name.joinToString("\n"))
        }
    }
}