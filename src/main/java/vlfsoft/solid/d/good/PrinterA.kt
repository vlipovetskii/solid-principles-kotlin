package vlfsoft.solid.d.good

import vlfsoft.principles.moduleclass.DependencyInversionPrinciple

@DependencyInversionPrinciple(true)
@DependencyInversionPrinciple.Abstraction
interface PrinterA {

    fun print(text: String)

}