package vlfsoft.solid.o.good

import vlfsoft.patterns.BehavioralPattern
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@BehavioralPattern.Strategy.Implementation
@OpenClosedPrinciple(false)
class ProductPriceCalculatorStrategy1(private val productBaseData : ProductBaseData) : ProductPriceCalculatorStrategyA {
    override fun calculateTaxIncludedPrice() = productBaseData.basePrice
}