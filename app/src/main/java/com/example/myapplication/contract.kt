package com.example.myapplication

interface contract {
    interface view{
        fun setTextView(name: ArrayList<String>?)
    }

    interface presenter{
        fun onSave(name: String)
        fun onFinish(name: ArrayList<String>?)
    }

    interface model{
        fun addToList(name: String, presenter: com.example.myapplication.presenter): Boolean
        fun showAllEntries(): ArrayList<String>?
    }
}