package com.xor_pj.designpatterns.structural.facade.interfaces

interface IPlayerManager {
    fun createPlayer(playerName: String)
    fun setDefaultInventory(playerName: String)
    fun setPlayerAttributes(playerName: String)
    fun loadPlayer(playerName: String)
}