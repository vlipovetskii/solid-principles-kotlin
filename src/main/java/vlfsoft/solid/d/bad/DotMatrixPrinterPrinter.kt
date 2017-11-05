package vlfsoft.solid.d.bad

import vlfsoft.principles.moduleclass.DependencyInversionPrinciple

@DependencyInversionPrinciple(false)
class DotMatrixPrinterPrinter {
    var inc: String? = null


    fun print(text: String) {
        println(text)
    }

}
