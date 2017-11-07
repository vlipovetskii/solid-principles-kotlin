package vlfsoft.solid.o.good

import vlfsoft.patterns.ObjectKindPattern
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@ObjectKindPattern.BO
@ObjectKindPattern.Immutable
@OpenClosedPrinciple(false)
data class ProductBasePrice(private val price: Double = 0.0) : ProductBasePriceA {
    override val value: Double
        get() = price
}