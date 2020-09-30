package com.generics.bridgelabz

import Ordering.Implicits._
class Maximum3Variables[T:Ordering](var type1:T, var type2:T, var type3:T){
  val first = type1
  val second = type2
  val third = type3

  def this() {
    this(0.asInstanceOf[T],1.asInstanceOf[T],2.asInstanceOf[T])
  }

  def maximumOf3Variables[T](): T = {
    var maxParam = first
    maxParam = compare(maxParam,second)
    maxParam = compare(maxParam,third)
    return maxParam.asInstanceOf[T]
  }

  def compare[T : Ordering](first: T, second: T) : T = if(first > second) first else second
}
