package com.xor_pj.designpatterns.structural.Adapter

import androidx.recyclerview.widget.RecyclerView

// Purpose : Allow objects dengan Interfaces yang berbeda untuk dipakai atau digunakan
// A: IWarrior  Target Interface D: IPlayable ( Method Method D )
// A: IMage Target Interface IPlayable ()

private interface IWarrior {
    fun swordAttack();
    fun blockAttack();
    fun berserk();
}
// Zilong
// Nolan
private interface IMage {
    fun castSpell();
    fun teleport();
}
//Cecil
// Target Interface
private interface IPlayable {
    fun attack();
    fun defend();
    fun useSpecialAbility();
}

private class Warrior : IWarrior {
    override fun swordAttack() {
        println("Warrior Attack")
    }

    override fun blockAttack() {
        println("Warrior Block")
    }

    override fun berserk() {
        println("Warrior using special ability, berserk")
    }

}

private class Mage : IMage {
    override fun castSpell() {
        println("Mage Cast Spell")
    }

    override fun teleport() {
        println("Mage using special ability, teleport")
    }
}


private class WarriorAdapterPlayable : IPlayable {
    private lateinit var warrior : IWarrior

    fun setWarrior(warrior: IWarrior) {
        this.warrior = warrior
    }

    override fun attack() {
        warrior.swordAttack()
    }

    override fun defend() {
        warrior.blockAttack()
    }

    override fun useSpecialAbility() {
        warrior.berserk()
    }
}


private class MageAdapterPlayable : IPlayable {
    private lateinit var mage: IMage

    fun setMage(mage : IMage) {
        this.mage = mage
    }

    override fun attack() {
        mage.castSpell()
    }

    override fun defend() {
        println("Mage cannot defend, due to casting spell")
    }

    override fun useSpecialAbility() {
        mage.teleport()
    }


}

fun main() {

    val warriorOrochi : IWarrior = Warrior()
    val mageElena : IMage = Mage()
    val mageCecilion: IMage = Mage()

    val mageAdapter = MageAdapterPlayable()
    val warriorAdapter = WarriorAdapterPlayable()

    mageAdapter.setMage(mageElena)
    warriorAdapter.setWarrior(warriorOrochi)



    val arrayOfHeroes : List<IPlayable> = arrayListOf(mageAdapter, warriorAdapter)
    var character : IPlayable = mageAdapter

    character.attack()
    character.defend()
    character.useSpecialAbility()

    character = warriorAdapter
    character.attack()
    character.defend()
    character.useSpecialAbility()
}