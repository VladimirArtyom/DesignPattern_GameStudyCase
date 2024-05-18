package com.xor_pj.designpatterns.structural.decorator.impl.drinks

import com.xor_pj.designpatterns.structural.decorator.interfaces.IDrink


class Soda(private val cost : Double) : IDrink(cost) {
    init {
        this.description = "Soda, "
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
