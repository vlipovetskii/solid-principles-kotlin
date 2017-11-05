package vlfsoft.solid.o.bad

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
class ShoppingCartService {

    fun calculateTotalOrder(products: List<Product>): Double {


        var orderTotal = 0.0


        for (product in products) {


            if ("FOOD" == product.type) {
                orderTotal += product.price + product.price * 0.08
            } else if ("CAR" == product.type) {
                orderTotal += product.price * 1.60 * 1.18
            } else if ("Electronics" == product.type) {
                orderTotal += product.price * 1.18
            }
        }

        return orderTotal
    }

}
