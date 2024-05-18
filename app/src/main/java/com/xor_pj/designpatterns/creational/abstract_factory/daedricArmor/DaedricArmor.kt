package com.xor_pj.designpatterns.creational.abstract_factory.daedricArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IChest

class DaedricArmor : IChest{
    override fun protectBody() {
        println("Protect Body using Daedric Armor")
    }
}