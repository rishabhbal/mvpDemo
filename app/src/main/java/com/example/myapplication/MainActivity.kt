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
    var deleteId: EditText? = null
    var modifyText: EditText? = null
    var btn: Button? = null
    var btnModify: Button? = null
    var btnDelete: Button? = null

    var presenter: presenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textView)
        editText = findViewById(R.id.editTextTextPersonName)
        deleteId = findViewById(R.id.editTextNumber)
        modifyText = findViewById(R.id.editTextTextPersonName2)
        btn = findViewById(R.id.button)
        btnModify = findViewById(R.id.button3)
        btnDelete = findViewById(R.id.button2)

        presenter = presenter(model(), this)

        btn?.setOnClickListener{
            presenter?.onSave(editText?.text.toString())
        }

        btnModify?.setOnClickListener {
            presenter?.onUpdate(deleteId?.text.toString(), modifyText?.text.toString())
        }

        btnDelete?.setOnClickListener {
            presenter?.onDeletePress(deleteId?.text.toString())
        }
    }

    override fun setTextView(name: ArrayList<String>?) {
        if (name != null) {
                textview?.setText(name.joinToString("\n"))
        }
    }
}