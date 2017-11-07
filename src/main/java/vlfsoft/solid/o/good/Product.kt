package vlfsoft.solid.o.good

import vlfsoft.patterns.ObjectKindPattern
import vlfsoft.patterns.StructuralPattern
import vlfsoft.principles.intermoduleclass.CompositionOverInheritancePrinciple
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(false)
@ObjectKindPattern.VO
@ObjectKindPattern.Immutable
@ObjectKindPattern.BO
@StructuralPattern.Association.Composition
@CompositionOverInheritancePrinciple(true)
open class Product<out T>(private val productBasePrice: ProductBasePriceA,
                          private val productPriceCalculatorFunction: ProductPriceCalculatorFunctionA,
                          val specificData: T) : ProductPriceA {

    override val productPrice: Double get() = productPriceCalculatorFunction(productBasePrice)

}