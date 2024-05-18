package com.xor_pj.designpatterns.creational.abstract_factory.IronArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IChest

class IronArmor : IChest{
    override fun protectBody() {
        println("Protect Body using Iron Armor")
    }
}