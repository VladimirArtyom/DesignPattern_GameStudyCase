package com.xor_pj.designpatterns.creational.abstract_factory.IronArmor

import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IArmorFactory
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IBoots
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IChest
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IGauntlets
import com.xor_pj.designpatterns.creational.abstract_factory.interfaces.IHelmet

class IronArmorFactory : IArmorFactory{
    override fun createHelmet(): IHelmet {
        return IronHelmet()
    }

    override fun createBoots(): IBoots {
        return IronBoots()
    }

    override fun createArmor(): IChest {
        return IronArmor()
    }

    override fun createGaunlets(): IGauntlets {
        return IronGaunlets()
    }
}