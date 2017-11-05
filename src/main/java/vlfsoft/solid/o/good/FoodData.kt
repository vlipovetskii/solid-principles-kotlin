package vlfsoft.solid.o.good

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
data class FoodData(var productBaseData : ProductBaseData, var sweet : Boolean)