package com.generics.bridgelabz

class Maximum3Variables {
  val Result = 1
  def maximumOf3NumbersInt(firstNumber:Int,secondNumber:Int,thirdNumber:Int): Int ={
    var maxNumber = firstNumber
    if(secondNumber.compareTo(firstNumber) == Result && secondNumber.compareTo(thirdNumber) == Result) {
      maxNumber = secondNumber
    }
    if(thirdNumber.compareTo(firstNumber) == Result && thirdNumber.compareTo(secondNumber) == Result) {
      maxNumber = thirdNumber
    }
    maxNumber
  }
}
