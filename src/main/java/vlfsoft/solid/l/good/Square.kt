package vlfsoft.solid.l.good

import vlfsoft.principles.moduleclass.LiskovSubstitutionPrinciple

@LiskovSubstitutionPrinciple(true)
class Square(side: Double) : Rectangle(side, side)
