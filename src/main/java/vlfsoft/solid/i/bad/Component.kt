package vlfsoft.solid.i.bad

import vlfsoft.principles.moduleclass.InterfaceSegregationPrinciple

@InterfaceSegregationPrinciple(false)
interface Component {

    fun mouseover(event: String)
    fun touch(event: String)
    fun swipe(event: String)
    fun validate()

}
