package vlfsoft.solid.o.good

import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
data class ElectronicDeviceData(var productBaseData : ProductBaseData, var model : String)