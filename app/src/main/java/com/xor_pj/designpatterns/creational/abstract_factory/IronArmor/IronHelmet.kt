package com.xor_pj.designpatterns.creational.abstract_factory.IronArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IHelmet

class IronHelmet : IHelmet {
    override fun protectHead() {
        println("Protect head using Iron Helmet")
    }
}