package com.xor_pj.designpatterns.structural.decorator.interfaces

abstract class Condiment(private var IDrink: IDrink) : IDrink(IDrink.cost()) {
    protected var cost : Double = 0.0
}