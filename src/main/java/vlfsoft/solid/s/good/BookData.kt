package vlfsoft.solid.s.good

import vlfsoft.patterns.ObjectKindPattern
import vlfsoft.patterns.StructuralPattern
import vlfsoft.principles.moduleclass.SingleResponsibilityPrinciple

@StructuralPattern.Adapter.AdapteeInterface
@ObjectKindPattern.BO
@ObjectKindPattern.VO
@ObjectKindPattern.Mutable
@SingleResponsibilityPrinciple(true)
data class BookData(var author: String? = null,
                    var text: String? = null,
                    var name: String? = null)
