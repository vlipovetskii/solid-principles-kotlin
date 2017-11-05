package vlfsoft.solid.s.good

import vlfsoft.principles.moduleclass.SingleResponsibilityPrinciple

@SingleResponsibilityPrinciple(true)
class Printer : PrinterA {

    override fun print(printable: PrintableA) {
        println(printable.content)
    }

}
