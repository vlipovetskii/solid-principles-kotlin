package vlfsoft.solid.o.good

import vlfsoft.principles.intermoduleclass.CompositionOverInheritancePrinciple
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
@CompositionOverInheritancePrinciple(true)
interface ProductPriceA {

    val productPrice: Double

}