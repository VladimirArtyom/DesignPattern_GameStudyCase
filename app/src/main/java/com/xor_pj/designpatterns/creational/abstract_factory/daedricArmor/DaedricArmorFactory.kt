package com.xor_pj.designpatterns.creational.abstract_factory.daedricArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IArmorFactory
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IBoots
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IChest
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IGauntlets
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IHelmet

class DaedricArmorFactory : IArmorFactory{
    override fun createHelmet(): IHelmet {
        return DaedricHelmet()
    }

    override fun createBoots(): IBoots {
        return DaedricBoots()
    }

    override fun createArmor(): IChest {
        return DaedricArmor()
    }

    override fun createGaunlets(): IGauntlets {
        return DaedricGauntlets()
    }
}