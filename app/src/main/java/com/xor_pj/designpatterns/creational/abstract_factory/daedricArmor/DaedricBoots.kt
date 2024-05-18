package com.xor_pj.designpatterns.creational.abstract_factory.daedricArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IBoots

class DaedricBoots : IBoots{
    override fun protectFoot() {
        println("Protect foot using Daedric boots")
    }
}