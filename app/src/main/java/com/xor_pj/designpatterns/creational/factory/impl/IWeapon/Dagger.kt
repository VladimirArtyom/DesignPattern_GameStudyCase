package com.xor_pj.designpatterns.creational.factory.impl.IWeapon

import com.xor_pj.designpatterns.creational.factory.interfaces.IWeapon

class Dagger : IWeapon {
    override fun attack() {
        println("Attack with Dagger")
    }

}