package vlfsoft.solid.l.bad

import vlfsoft.principles.moduleclass.LiskovSubstitutionPrinciple

@LiskovSubstitutionPrinciple(false)
open class Rectangle(open var width: Double = 0.0, open var height: Double = 0.00) {

    val area: Double
        get() {
            return width * height
        }

}
