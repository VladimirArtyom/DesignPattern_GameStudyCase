package com.xor_pj.designpatterns.structural.facade.impl

import com.xor_pj.designpatterns.structural.facade.interfaces.ISaveManager

class SaveManager : ISaveManager{
    private var saveName: String = "default"
    override fun saveToDisk() {
        println("Saving to disk...")
        this.saveName = "Save data #1 - Skyrim"
    }

    override fun saveToCloud() {
        println("Saving to cloud")
    }

    override fun loadSave(saveName: String) {
        if (this.saveName == saveName) {
            println("Load save data ...")
            return
        }

        println("Failed to load save data, $saveName is not exists")
    }
}