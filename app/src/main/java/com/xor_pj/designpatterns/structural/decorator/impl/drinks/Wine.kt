package com.xor_pj.designpatterns.structural.decorator.impl.drinks

import com.xor_pj.designpatterns.structural.decorator.interfaces.IDrink

class Wine(private val cost: Double) : IDrink(cost){
    init {
        this.description = "Wine,"
    }
    override fun pour(): String {
        return this.description
    }

    override fun cost(): Double {
        return this.cost
    }

    override fun description(): String {
        return "Drink : ${this.description}\n cost : ${this.cost()}"
    }
}