package com.edmondo.boilerplate


// Convert and transform multiple
object Example5 extends TrySyntax {


  case class Class1(s:Long, data:String, s2:Double)


  case class Class2(s:BigInt,data:String, s2:BigDecimal)

  implicit def longToBigInteger(s:Long):Either[Throwable,BigInt]  = trySomething(BigInt(s))

  implicit def doubleToBigDecimal(s2:Double):Either[Throwable,BigDecimal] = trySomething(BigDecimal(s2))


  val converter = implicitly[Converter[Class1,Class2,Throwable]]

  // One certainly needs the reverse of longToBigInteger/doubleToBigDecimal in scope
  val converter2 = implicitly[Converter[Class2,Class1,Throwable]]
}
