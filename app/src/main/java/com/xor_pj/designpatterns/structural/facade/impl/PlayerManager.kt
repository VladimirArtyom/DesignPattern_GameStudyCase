package com.xor_pj.designpatterns.structural.facade.impl

import com.xor_pj.designpatterns.structural.facade.interfaces.IPlayerManager

class PlayerManager : IPlayerManager {
    override fun createPlayer(playerName: String) {
        println("Player created: $playerName" )
    }

    override fun setDefaultInventory(playerName: String) {
        println("Set player default inventory of $playerName")
    }

    override fun setPlayerAttributes(playerName: String) {
        println("Set player attributes $playerName")
    }

    override fun loadPlayer(playerName: String) {
        println("player loaded $playerName")
    }
}