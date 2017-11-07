package vlfsoft.solid.o.good

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(true)
class ShoppingCartService : ShoppingCartServiceA {

    override fun calculateTotalOrder(productStrategies: List<ProductPriceA>) =
            productStrategies.stream()
                    .mapToDouble { it.productPrice }
                    .sum()

}
