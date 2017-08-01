package com.edmondo.boilerplate


// Simple conversion with error between types
object Example2 extends TrySyntax {





  case class Class1(id:Int, data:String)


  def stringToInt(data:String):Either[Throwable,Int] = trySomething(data.toInt)

  case class Class2(id:Int, data:Int)


  val converter = implicitly[Converter[Class1,Class2,Throwable]]


}
