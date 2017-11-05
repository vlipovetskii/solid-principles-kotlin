package vlfsoft.solid.o.bad

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
class Product {

    var name: String? = null
    var price: Double = 0.toDouble()
    var type: String? = null

}
