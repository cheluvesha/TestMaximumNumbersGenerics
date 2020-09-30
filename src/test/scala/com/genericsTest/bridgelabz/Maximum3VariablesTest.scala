package com.genericsTest.bridgelabz
import com.generics.bridgelabz.Maximum3Variables
import org.scalatest.FunSuite

class Maximum3VariablesTest extends FunSuite {

  test("MaximumIntegerInputNumberAtFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val maximum3Variables = new  Maximum3Variables(6,4,3)
    assert(maximum3Variables.maximumOf3Variables[java.lang.Integer]() === 6)
  }

  test("MaximumIntegerInputNumberAtSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val maximum3Variables = new  Maximum3Variables(6,7,4)
    assert(maximum3Variables.maximumOf3Variables[java.lang.Integer]() === 7)
  }

  test("MaximumIntegerInputNumberAtThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val maximum3Variables = new  Maximum3Variables(6,7,8)
    assert(maximum3Variables.maximumOf3Variables[java.lang.Integer]() === 8)
  }
  test("MaximumFloatInputNumberatFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val maximum3Variables = new Maximum3Variables(6.1f,4.2f,3.2f)
    assert(maximum3Variables.maximumOf3Variables[java.lang.Float]() === 6.1f)
  }

  test("MaximumFloatInputNumberAtSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val maximum3Variables = new Maximum3Variables(6.1f,8.2f,3.2f)
    assert(maximum3Variables.maximumOf3Variables[java.lang.Float]() === 8.2f)
  }

  test("MaximumFloatInputNumberAtThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val maximum3Variables = new Maximum3Variables(6.1f,8.2f,9.2f)
    assert(maximum3Variables.maximumOf3Variables[java.lang.Float]() === 9.2f)
  }
  test("MaximumStringInputStringAtFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum") {
    val maximum3Variables = new Maximum3Variables("Peach", "Banana", "Apple")
    assert(maximum3Variables.maximumOf3Variables[java.lang.String]() === "Peach")
  }

  test("MaximumStringInputStringAtSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val maximum3Variables = new Maximum3Variables("Orange","Van","Red")
    assert(maximum3Variables.maximumOf3Variables[java.lang.String]() === "Van")
  }

  test("MaximumStringInputNumberAtThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val maximum3Variables = new Maximum3Variables("Keyboard","Chair","Mouse")
    assert(maximum3Variables.maximumOf3Variables[java.lang.String]() === "Mouse")
  }

}
