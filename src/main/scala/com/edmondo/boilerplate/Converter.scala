package com.edmondo.boilerplate


// To refine how to decide the left side of either / the right monad type p
trait Converter[A,B,C] {
   def apply(a:A):Either[C,B]
}

object Converter{

  def apply[A,B,C](implicit converter:Converter[A,B,C]) = ???

  implicit def converter[A,B,C]:Converter[A,B,C] = ???

}
