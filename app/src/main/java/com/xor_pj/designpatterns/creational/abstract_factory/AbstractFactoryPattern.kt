package com.xor_pj.designpatterns.creational.abstract_factory

import com.xor_pj.designpatterns.creational.abstract_factory.IronArmor.IronArmor
import com.xor_pj.designpatterns.creational.abstract_factory.IronArmor.IronArmorFactory
import com.xor_pj.designpatterns.creational.abstract_factory.IronArmor.IronBoots
import com.xor_pj.designpatterns.creational.abstract_factory.IronArmor.IronGaunlets
import com.xor_pj.designpatterns.creational.abstract_factory.IronArmor.IronHelmet
import com.xor_pj.designpatterns.creational.abstract_factory.daedricArmor.DaedricArmorFactory
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IArmorFactory
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IBoots
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IChest
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IGauntlets
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IHelmet

class Player() {
    var playerArmor: IChest? = null // Ga ada concrete class
    var playerHelmet: IHelmet? = null
    var playerBoots: IBoots? = null
    var playerGauntlets: IGauntlets? = null

    fun setArmor(armor : IChest) {
        this.playerArmor = armor
    }

    fun setHelmet(helmet: IHelmet) {
        this.playerHelmet = helmet
    }

    fun setBoots(boots: IBoots) {
        this.playerBoots = boots
    }

    fun setGauntlets(gauntlets: IGauntlets) {
        this.playerGauntlets = gauntlets
    }
    fun printPlayerInfo() {
        println(this.playerHelmet.toString())
        println(this.playerArmor.toString())
        println(this.playerGauntlets.toString())
        println(this.playerBoots.toString())
    }
}

fun main() {
    val daedricArmorFactory: IArmorFactory = DaedricArmorFactory()
    val ironArmorFactory: IArmorFactory = IronArmorFactory()

    val armor = daedricArmorFactory.createArmor()
    val helmet = daedricArmorFactory.createHelmet()
    val boots = ironArmorFactory.createBoots()
    val gauntlets = ironArmorFactory.createGaunlets()

    val player = Player()
    player.setHelmet(helmet)
    player.setArmor(armor)
    player.setBoots(boots)
    player.setGauntlets(gauntlets)

    player.printPlayerInfo()

}
