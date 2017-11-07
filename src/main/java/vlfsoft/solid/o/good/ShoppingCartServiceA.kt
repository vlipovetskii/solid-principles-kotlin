package vlfsoft.solid.o.good

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(true)
interface ShoppingCartServiceA {
    fun calculateTotalOrder(productStrategies: List<ProductPriceA>): Double
}