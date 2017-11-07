package vlfsoft.solid.o.good

import vlfsoft.patterns.BehavioralPattern
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@BehavioralPattern.Strategy.Implementation
@OpenClosedPrinciple(true)
fun productPriceCalculatorStrategy1(productBasePrice: ProductBasePriceA) = productBasePrice.value
fun productPriceCalculatorStrategy2(productBasePrice: ProductBasePriceA) = productBasePrice.value * 1.08
fun productPriceCalculatorStrategy3(productBasePrice: ProductBasePriceA) = productBasePrice.value * 1.18
fun productPriceCalculatorStrategy4(productBasePrice: ProductBasePriceA) = productBasePrice.value * 1.60 * 1.18
