package vlfsoft.solid.s.bad

import vlfsoft.principles.moduleclass.SingleResponsibilityPrinciple

@SingleResponsibilityPrinciple(false)
class Book {

    var author: String? = null
    var text: String? = null
    var name: String? = null


    fun print() {
        println(text)
    }

}
