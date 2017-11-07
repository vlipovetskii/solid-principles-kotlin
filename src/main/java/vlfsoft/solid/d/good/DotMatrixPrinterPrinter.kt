package vlfsoft.solid.d.good

import vlfsoft.principles.moduleclass.DependencyInversionPrinciple

@DependencyInversionPrinciple(true)
@DependencyInversionPrinciple.Implementation.LowLevelModule
class DotMatrixPrinterPrinter : PrinterA {
    var inc: String? = null


    override fun print(text: String) {
        println(text)
    }

}
