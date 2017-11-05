package vlfsoft.solid.i.good

import vlfsoft.principles.moduleclass.InterfaceSegregationPrinciple

@InterfaceSegregationPrinciple(true)
interface NonTouchUIComponentA : UICOmponentA {
    fun mouseover(event: String)

}
