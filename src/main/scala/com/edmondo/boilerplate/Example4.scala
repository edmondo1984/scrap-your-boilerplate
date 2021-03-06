package com.edmondo.boilerplate

// Convert and allow for input parameter
object Example4 {


  case class Class1(data:String)


  case class Class2(autoGeneratedId:Int, data:String)


  val converter = implicitly[Converter[Class1,Int => Class2,Throwable]]

  // Ignore auto generated id
  val converter2 = implicitly[Converter[Class2,Class1,Throwable]]
}
