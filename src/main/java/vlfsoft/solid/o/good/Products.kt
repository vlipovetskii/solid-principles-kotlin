package vlfsoft.solid.o.good

import vlfsoft.patterns.ObjectKindPattern
import vlfsoft.principles.moduleclass.OpenClosedPrinciple

@OpenClosedPrinciple(true)
@ObjectKindPattern.BO
@ObjectKindPattern.VO
@ObjectKindPattern.Mutable
data class CarData(var power: Int)

class CarProduct(productBasePrice: ProductBasePrice, specificData: CarData) : Product<CarData>(productBasePrice, ::productPriceCalculatorStrategy1, specificData)

@OpenClosedPrinciple(true)
@ObjectKindPattern.BO
@ObjectKindPattern.VO
@ObjectKindPattern.Mutable
data class ElectronicDeviceData(var model: String)

class ElectronicDeviceProduct(productBasePrice: ProductBasePrice, specificData: ElectronicDeviceData) : Product<ElectronicDeviceData>(productBasePrice, ::productPriceCalculatorStrategy2, specificData)

@OpenClosedPrinciple(true)
@ObjectKindPattern.BO
@ObjectKindPattern.VO
@ObjectKindPattern.Mutable
data class FoodData(var sweet: Boolean)

class FoodProduct(productBasePrice: ProductBasePrice, specificData: FoodData) : Product<FoodData>(productBasePrice, ::productPriceCalculatorStrategy3, specificData)

@OpenClosedPrinciple(true)
@ObjectKindPattern.BO
@ObjectKindPattern.VO
@ObjectKindPattern.Mutable
data class GemData(var color: Int)

class GemProduct(productBasePrice: ProductBasePrice, specificData: GemData) : Product<GemData>(productBasePrice, ::productPriceCalculatorStrategy4, specificData)