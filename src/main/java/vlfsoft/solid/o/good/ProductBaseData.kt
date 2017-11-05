package vlfsoft.solid.o.good

import vlfsoft.patterns.ObjectKindPattern
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@ObjectKindPattern.BO
@ObjectKindPattern.Mutable
@OpenClosedPrinciple(false)
data class ProductBaseData(val basePrice: Double = 0.0, val productPriceCalculatorStrategy: ProductPriceCalculatorStrategyA) : ProductPriceCalculatorStrategyA by productPriceCalculatorStrategy

