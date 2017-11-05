package vlfsoft.solid.d.good

import vlfsoft.principles.moduleclass.DependencyInversionPrinciple

@DependencyInversionPrinciple(true)
class PrinterDesk(private val printer: PrinterA) {


    fun printFile() {
        printer.print("File Content")
    }

}
