package com.example.myapplication

interface contract {
    interface view{
        fun setTextView(name: ArrayList<String>?)
    }

    interface presenter{
        fun onSave(name: String)
        fun onFinish(name: ArrayList<String>?)
        fun onDeletePress(id: String)
        fun onUpdate(id: String, name: String)
    }

    interface model{
        fun addToList(name: String, presenter: com.example.myapplication.presenter): Boolean
        fun showAllEntries(): ArrayList<String>?
        fun onDelete(id: Int): Boolean
        fun onUpdate(id: Int, name: String): Boolean
    }
}