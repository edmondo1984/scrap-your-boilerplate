package com.edmondo.boilerplate

import scala.util.{Failure, Success, Try}


// We are still in Scala 2.11 sigh
trait TrySyntax {


  def trySomething[A](a: => A):Either[Throwable,A]  = Try(a) match {
    case Failure(e) => Left(e)
    case Success(a) => Right(a)
  }
}
