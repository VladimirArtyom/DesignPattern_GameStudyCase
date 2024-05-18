package com.xor_pj.designpatterns.creational.abstract_factory.interfaces

interface IArmorFactory {
    fun createHelmet(): IHelmet
    fun createBoots(): IBoots
    fun createArmor(): IChest
    fun createGaunlets(): IGauntlets
}