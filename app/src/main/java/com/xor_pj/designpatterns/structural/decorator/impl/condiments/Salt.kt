package com.xor_pj.designpatterns.structural.decorator.impl.condiments

import com.xor_pj.designpatterns.structural.decorator.interfaces.Condiment
import com.xor_pj.designpatterns.structural.decorator.interfaces.IDrink

class Salt(private val drink: IDrink) : Condiment(drink){
    init {
        this.cost = 0.1
    }
    override fun pour(): String {
        this.description = "${this.drink.pour()}Salt,"
        return this.description
    }

    override fun cost(): Double {
        return this.drink.cost() + this.cost
    }

    override fun description(): String {

        return "Drink : ${this.description}\n cost : ${this.cost()}"
    }

}