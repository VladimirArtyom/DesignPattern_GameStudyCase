package com.xor_pj.designpatterns.creational.factory

import androidx.lifecycle.ViewModelProvider
import com.xor_pj.designpatterns.creational.factory.impl.IWeapon.Bow
import com.xor_pj.designpatterns.creational.factory.impl.IWeapon.Dagger
import com.xor_pj.designpatterns.creational.factory.impl.IWeapon.Sword
import com.xor_pj.designpatterns.creational.factory.interfaces.IWeapon

class WeaponFactory {
    fun createWeapon(weaponType : String) : IWeapon {
        return when (weaponType) {
            "sword" -> {
                Sword()
            }

            "bow" -> {
                Bow()
            }

            "dagger"-> {
                Dagger()
            }

            else -> {
                throw Exception("Bang udah bang")
            }
        }
    }
}

fun main() {
    try {
        val wpFactory : WeaponFactory = WeaponFactory()
        val sword: IWeapon = wpFactory.createWeapon("sword")
        val dagger: IWeapon = wpFactory.createWeapon("dagger")
        sword.attack()
        //wpFactory.createWeapon("bag")
    } catch (e : Exception) {
        println(e.message)
    }
}