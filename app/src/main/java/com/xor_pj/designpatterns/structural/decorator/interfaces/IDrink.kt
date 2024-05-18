package com.xor_pj.designpatterns.structural.decorator.interfaces

public abstract class IDrink(private val costDrink : Double) {
    var description = ""
    abstract fun pour() : String;
    abstract fun cost() : Double;
    abstract fun description() : String;
}