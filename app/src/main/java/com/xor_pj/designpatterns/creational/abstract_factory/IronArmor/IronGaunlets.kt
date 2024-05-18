package com.xor_pj.designpatterns.creational.abstract_factory.IronArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IGauntlets

class IronGaunlets : IGauntlets{
    override fun protectHand() {
        println("Protect hand using Iron Gauntlets")
    }
}