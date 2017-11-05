package vlfsoft.solid.s.good

import vlfsoft.principles.moduleclass.SingleResponsibilityPrinciple

@SingleResponsibilityPrinciple(true)
interface PrinterA {
    fun print(printable: PrintableA)
}