package vlfsoft.solid.d.bad

import vlfsoft.principles.moduleclass.DependencyInversionPrinciple

@DependencyInversionPrinciple(false)
@DependencyInversionPrinciple.Implementation.LowLevelModule
class DotMatrixPrinterPrinter {
    var inc: String? = null


    fun print(text: String) {
        println(text)
    }

}
