package vlfsoft.solid.s.good

import vlfsoft.patterns.StructuralPattern
import vlfsoft.principles.moduleclass.SingleResponsibilityPrinciple

@SingleResponsibilityPrinciple(true)
@StructuralPattern.Adapter.ObjectAdapter
data class PrintableBook(private val bookData: BookData) : PrintableA {

    override val content: String?
        get() = bookData.text

}