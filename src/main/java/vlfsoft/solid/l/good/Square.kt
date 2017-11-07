package vlfsoft.solid.l.good

import vlfsoft.principles.moduleclass.LiskovSubstitutionPrinciple

@LiskovSubstitutionPrinciple(true)
@LiskovSubstitutionPrinciple.Subtype
class Square(side: Double) : Rectangle(side, side)
