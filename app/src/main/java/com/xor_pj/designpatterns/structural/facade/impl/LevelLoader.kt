package com.xor_pj.designpatterns.structural.facade.impl

import com.xor_pj.designpatterns.structural.facade.interfaces.ILevelLoader

class LevelLoader : ILevelLoader{
    override fun loadInitialLevel() {
        println("Initial Level Loaded")
    }

    override fun loadSavedLevel() {
        println("Saved Level Loaded")
    }
}