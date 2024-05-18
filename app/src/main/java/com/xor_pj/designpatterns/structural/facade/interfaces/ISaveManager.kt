package com.xor_pj.designpatterns.structural.facade.interfaces

interface ISaveManager {
    fun saveToDisk()
    fun saveToCloud()
    fun loadSave(saveName: String)
}