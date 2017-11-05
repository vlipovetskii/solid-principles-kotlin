package vlfsoft.solid.o.good

import vlfsoft.patterns.BehavioralPattern
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@BehavioralPattern.Strategy.Interface
@OpenClosedPrinciple(false)
interface ProductPriceCalculatorStrategyA {

    fun calculateTaxIncludedPrice(): Double

}
