package vlfsoft.solid.l.bad

import vlfsoft.principles.moduleclass.LiskovSubstitutionPrinciple

@LiskovSubstitutionPrinciple(false)
class Square : Rectangle() {

    override var height: Double
        get() = throw IllegalAccessException()
        set(height) {
            throw IllegalAccessException()
        }

    override var width: Double
        get() = throw IllegalAccessException()
        set(width) {
            throw IllegalAccessException()
        }

}
