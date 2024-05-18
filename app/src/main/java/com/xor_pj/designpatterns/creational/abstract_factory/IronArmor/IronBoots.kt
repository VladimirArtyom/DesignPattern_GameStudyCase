package com.xor_pj.designpatterns.creational.abstract_factory.IronArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IBoots

class IronBoots : IBoots{
    override fun protectFoot() {
        println("Protect foot using Iron boots")
    }
}