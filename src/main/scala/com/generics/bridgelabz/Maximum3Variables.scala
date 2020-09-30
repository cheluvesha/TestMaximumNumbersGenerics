package com.generics.bridgelabz

class Maximum3Variables {

  def maximumOf3NumbersInt(firstNumber:Int,secondNumber:Int,thirdNumber:Int): Int ={
    var maxNumber = firstNumber
    if(secondNumber.compareTo(firstNumber) == 1 && secondNumber.compareTo(thirdNumber)== 1) {
      maxNumber = secondNumber
    }
    if(thirdNumber.compareTo(firstNumber) == 1 && thirdNumber.compareTo(secondNumber)== 1) {
      maxNumber = thirdNumber
    }
    maxNumber
  }
  def maximumOf3NumbersFloat(firstNumber:Float,secondNumber:Float,thirdNumber:Float): Float ={
    var maxNumber = firstNumber
    if(secondNumber.compareTo(firstNumber) == 1 && secondNumber.compareTo(thirdNumber)== 1) {
      maxNumber = secondNumber
    }
    if(thirdNumber.compareTo(firstNumber) == 1 && thirdNumber.compareTo(secondNumber)== 1) {
      maxNumber = thirdNumber
    }
    maxNumber
  }
  def maximumOf3NumbersString(firstString:String,secondString:String,thirdString:String): String ={
    var maxString = firstString
    if(secondString.compareTo(firstString) > 0 && secondString.compareTo(thirdString) > 0) {
      maxString = secondString
    }
    if(thirdString.compareTo(firstString) > 0 && thirdString.compareTo(secondString) > 0) {
      maxString = thirdString
    }
    maxString
  }
}
