package vlfsoft.solid.o.good

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
data class GemData(var productBaseData : ProductBaseData, var color : Int)