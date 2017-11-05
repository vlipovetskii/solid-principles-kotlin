package vlfsoft.solid.d.bad

import vlfsoft.principles.moduleclass.DependencyInversionPrinciple

@DependencyInversionPrinciple(false)
class PrinterDesk(private val printer: DotMatrixPrinterPrinter) {


    fun printFile() {
        printer.print("File Content")
    }

}
