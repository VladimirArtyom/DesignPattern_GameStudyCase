package com.xor_pj.designpatterns.structural.decorator.impl.condiments

import com.xor_pj.designpatterns.structural.decorator.interfaces.Condiment
import com.xor_pj.designpatterns.structural.decorator.interfaces.IDrink

class Honey(private val drink: IDrink) : Condiment(drink){
    init {
        this.cost = 0.25
    }
    override fun pour(): String {
        this.description =  "${this.drink.pour()}Honey,"
        return this.description
    }

    override fun cost(): Double {
        return this.drink.cost() + this.cost
    }

    override fun description(): String {
        return "Drink : ${this.description}\n cost : ${this.cost()}"
    }
}