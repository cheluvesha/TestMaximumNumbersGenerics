package com.generics.bridgelabz

class Maximum3Variables {
  val Result = 1
  val StringResult = 0
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
  def maximumOf3NumbersFloat(firstNumber:Float,secondNumber:Float,thirdNumber:Float): Float ={
    var maxNumber = firstNumber
    if(secondNumber.compareTo(firstNumber) == Result && secondNumber.compareTo(thirdNumber) == Result) {
      maxNumber = secondNumber
    }
    if(thirdNumber.compareTo(firstNumber) == Result && thirdNumber.compareTo(secondNumber) == Result) {
      maxNumber = thirdNumber
    }
    maxNumber
  }
  def maximumOf3NumbersString(firstString:String,secondString:String,thirdString:String): String ={
    var maxString = firstString
    if(secondString.compareTo(firstString) > StringResult && secondString.compareTo(thirdString) > StringResult) {
      maxString = secondString
    }
    if(thirdString.compareTo(firstString) > StringResult && thirdString.compareTo(secondString) > StringResult) {
      maxString = thirdString
    }
    maxString
  }
}
