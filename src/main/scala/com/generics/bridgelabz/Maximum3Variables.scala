package com.generics.bridgelabz

import Ordering.Implicits._
class Maximum3Variables[T:Ordering](var type1:T, var type2:T, var type3:T){
  val first: T = type1
  val second: T = type2
  val third: T = type3

  def this() {
    this(0.asInstanceOf[T],1.asInstanceOf[T],2.asInstanceOf[T])
  }

  def maximumOf3Variables[T](): T = {
    var max = first
    max = compare(max,second)
    max = compare(max,third)
    printMaxValue(max)
    return max.asInstanceOf[T]
  }

  def printMaxValue(maxValue : T): Unit = {
    println("Maximum Value is : "+maxValue)
  }

  def compare[T : Ordering](firstType: T, secondType: T) : T = if(firstType > secondType) firstType else secondType
}
