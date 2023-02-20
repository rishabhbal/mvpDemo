package com.example.myapplication

import android.util.Log
import android.widget.Toast

class presenter(private var model: contract.model, private var view: contract.view): contract.presenter {
    override fun onSave(name: String) {
        val response = model.addToList(name, this)
        if (response == true){
            view.setTextView(model.showAllEntries())
        }
    }

    override fun onFinish(name: ArrayList<String>?) {
        view.setTextView(name)
    }

}