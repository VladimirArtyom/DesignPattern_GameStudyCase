package com.xor_pj.designpatterns.creational.abstract_factory.daedricArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IGauntlets

class DaedricGauntlets : IGauntlets{
    override fun protectHand() {
        println("Protect hand using Daedric Gauntlets")
    }
}