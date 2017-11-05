package vlfsoft.solid.i.good

import vlfsoft.principles.moduleclass.InterfaceSegregationPrinciple

@InterfaceSegregationPrinciple(true)
class AndroidComponent : TouchUIComponentA {

    override fun touch(event: String) {
        println("Touch Event Fired")

    }

    override fun swipe(event: String) {
        println("Swipe Event Fired")

    }

    override fun validate() {
        println("All UI i valid")

    }

}
