package vlfsoft.solid.s.good

import vlfsoft.patterns.StructuralPattern
import vlfsoft.principles.moduleclass.SingleResponsibilityPrinciple

@StructuralPattern.Adapter.TargetInterface
@SingleResponsibilityPrinciple(true)
interface PrintableA {
    val content: String?
}
