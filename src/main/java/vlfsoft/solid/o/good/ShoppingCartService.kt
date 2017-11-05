package vlfsoft.solid.o.good

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
class ShoppingCartService : ShoppingCartServiceA {

    override fun calculateTotalOrder(productStrategies: List<ProductPriceCalculatorStrategyA>) =
            productStrategies.stream()
                    .mapToDouble { it.calculateTaxIncludedPrice() }
                    .sum()

}
