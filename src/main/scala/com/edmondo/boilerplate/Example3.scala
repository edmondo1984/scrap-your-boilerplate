package com.edmondo.boilerplate

import com.edmondo.boilerplate.Example2.trySomething

// Convert and wrap
object Example3 {


  case class Class1(id:Int, data:String)

  case class Something(s:Int)


  def stringToInt(data:String):Either[Throwable,Something] = trySomething(Something(data.toInt))

  case class Class2(id:Int, data:Something)


  val converter = implicitly[Converter[Class1,Class2,Throwable]]
}
