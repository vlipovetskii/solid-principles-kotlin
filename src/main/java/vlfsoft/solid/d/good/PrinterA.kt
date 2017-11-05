package vlfsoft.solid.d.good

import vlfsoft.principles.moduleclass.DependencyInversionPrinciple

@DependencyInversionPrinciple(true)
interface PrinterA {

    fun print(text: String)

}