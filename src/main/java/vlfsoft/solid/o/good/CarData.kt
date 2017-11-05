package vlfsoft.solid.o.good

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
data class CarData(var productBaseData : ProductBaseData, var power : Int)