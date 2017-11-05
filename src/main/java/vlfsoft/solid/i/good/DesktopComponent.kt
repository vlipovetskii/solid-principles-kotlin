package vlfsoft.solid.i.good

import vlfsoft.principles.moduleclass.InterfaceSegregationPrinciple

@InterfaceSegregationPrinciple(true)
class DesktopComponent : NonTouchUIComponentA {

    override fun mouseover(event: String) {
        println("Mouse click Event Fired")

    }

    override fun validate() {
        println("All UI i valid")

    }

}
