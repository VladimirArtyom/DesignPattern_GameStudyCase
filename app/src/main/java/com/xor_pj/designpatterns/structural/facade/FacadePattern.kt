package com.xor_pj.designpatterns.structural.facade

import com.xor_pj.designpatterns.structural.facade.impl.LevelLoader
import com.xor_pj.designpatterns.structural.facade.impl.PlayerManager
import com.xor_pj.designpatterns.structural.facade.impl.SaveManager
import com.xor_pj.designpatterns.structural.facade.interfaces.ILevelLoader
import com.xor_pj.designpatterns.structural.facade.interfaces.IPlayerManager
import com.xor_pj.designpatterns.structural.facade.interfaces.ISaveManager

class GameFacade(
    private val levelLoader: ILevelLoader,
    private val saveManager: ISaveManager,
    private val playerManager: IPlayerManager
    ) {
    // Inject

    fun startNewGame(playerName: String) {
        playerManager.createPlayer(playerName)
        playerManager.setDefaultInventory(playerName)
        playerManager.setPlayerAttributes(playerName)
        levelLoader.loadInitialLevel()
        this.saveGame()
    }

    fun saveGame() {
        saveManager.saveToDisk()
        saveManager.saveToCloud()
        println("Game Saved")
    }

    fun loadSaveGame(playerName: String) {
        playerManager.loadPlayer(playerName)
        levelLoader.loadSavedLevel()
        println("Game Loaded.")
    }
}

fun main() {
    val playerManager: IPlayerManager = PlayerManager()
    val levelLoader: ILevelLoader = LevelLoader()
    val saveManager: ISaveManager = SaveManager()

    val gameFacade: GameFacade = GameFacade(
        levelLoader,
        saveManager,
        playerManager
    )

    gameFacade.startNewGame("primitif")
    println("Load use")
    gameFacade.loadSaveGame("primitif")
}
