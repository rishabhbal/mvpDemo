package com.example.myapplication

class model: contract.model {
    var namesList: ArrayList<String> = ArrayList()

    override fun addToList(name: String, presenter: presenter): Boolean {
        namesList?.add(name)
        return true
    }

    override fun showAllEntries(): ArrayList<String>? {
        return namesList
    }

    override fun onDelete(id: Int): Boolean {
        namesList?.removeAt(id)
        return true
    }

    override fun onUpdate(id: Int, name: String): Boolean {
        namesList?.set(id, name)
        return true
    }
}