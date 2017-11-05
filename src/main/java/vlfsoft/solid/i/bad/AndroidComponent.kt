package vlfsoft.solid.i.bad

import vlfsoft.principles.moduleclass.InterfaceSegregationPrinciple

@InterfaceSegregationPrinciple(false)
class AndroidComponent : Component {


    override fun mouseover(event: String) {
        throw UnsupportedOperationException("mouse click not supported")

    }

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
