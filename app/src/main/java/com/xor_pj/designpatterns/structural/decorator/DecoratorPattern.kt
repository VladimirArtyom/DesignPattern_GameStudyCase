package com.xor_pj.designpatterns.structural.decorator

import com.xor_pj.designpatterns.structural.decorator.impl.condiments.Honey
import com.xor_pj.designpatterns.structural.decorator.impl.condiments.Milk
import com.xor_pj.designpatterns.structural.decorator.impl.condiments.Salt
import com.xor_pj.designpatterns.structural.decorator.impl.condiments.Sugar
import com.xor_pj.designpatterns.structural.decorator.impl.condiments.Syrup
import com.xor_pj.designpatterns.structural.decorator.impl.drinks.Tea
import com.xor_pj.designpatterns.structural.decorator.impl.drinks.Water
import com.xor_pj.designpatterns.structural.decorator.interfaces.Condiment
import com.xor_pj.designpatterns.structural.decorator.interfaces.IDrink

fun main() {

    val waterAqua: IDrink = Water(1.50)
    val tea: IDrink = Tea(2.0)
    val waterAquaSugarHoney : Condiment = Sugar(Honey(waterAqua))
    val teaMilkSaltSyrupSugar : Condiment = Sugar(Syrup(Salt(Milk(tea))))

    waterAquaSugarHoney.pour()
    teaMilkSaltSyrupSugar.pour()
    println(teaMilkSaltSyrupSugar.description())
}


