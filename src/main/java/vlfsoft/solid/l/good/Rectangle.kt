package vlfsoft.solid.l.good

import vlfsoft.principles.moduleclass.LiskovSubstitutionPrinciple

@LiskovSubstitutionPrinciple(true)
open class Rectangle(private val width: Double, private val height: Double) {

    val area: Double
        get() {
            return width * height
        }

}
