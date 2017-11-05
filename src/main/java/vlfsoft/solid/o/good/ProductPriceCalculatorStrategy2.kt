package vlfsoft.solid.o.good

import vlfsoft.patterns.BehavioralPattern
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@BehavioralPattern.Strategy.Implementation
@OpenClosedPrinciple(false)
class ProductPriceCalculatorStrategy2(private val productBaseData : ProductBaseData) : ProductPriceCalculatorStrategyA {

    override fun calculateTaxIncludedPrice() = productBaseData.basePrice * 1.08

}