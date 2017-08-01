package com.edmondo.boilerplate

import java.sql.Timestamp
import java.time.ZonedDateTime


// Simple obvious conversion between types
object Example1 {


  case class Class1(id:Int, data:Timestamp)

  case class Class2(id:Int, data:ZonedDateTime)


  val converter = implicitly[Converter[Class1,Class2,Throwable]]


}
