package vlfsoft.solid.o.good

interface ShoppingCartServiceA {
    fun calculateTotalOrder(productStrategies: List<ProductPriceCalculatorStrategyA>) : Double
}