package vlfsoft.solid.i.good

import vlfsoft.principles.moduleclass.InterfaceSegregationPrinciple

@InterfaceSegregationPrinciple(true)
interface TouchUIComponentA : UICOmponentA {
    fun touch(event: String)
    fun swipe(event: String)
}
