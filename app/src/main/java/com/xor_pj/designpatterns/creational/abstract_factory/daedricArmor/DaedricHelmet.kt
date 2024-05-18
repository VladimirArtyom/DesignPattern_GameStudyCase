package com.xor_pj.designpatterns.creational.abstract_factory.daedricArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IHelmet

class DaedricHelmet : IHelmet {
    override fun protectHead() {
        println("Protect head using Daedric Helmet")
    }
}