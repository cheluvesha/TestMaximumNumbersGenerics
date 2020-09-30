package com.genericsTest.bridgelabz

import com.generics.bridgelabz.Maximum3Variables
import org.scalatest.FunSuite

class Maximum3VariablesTest extends FunSuite {

  test("MaximumInputNumberAtFirstFollowedBySecondAndThirdInput_ReturnFirstInputAsMaximum"){
    val maximum3Variables = new  Maximum3Variables()
    assert(maximum3Variables.maximumOf3NumbersInt(7,4,5) === 7)
  }

  test("MaximumInputNumberAtSecondFollowedByFirstAndThirdInput_ReturnSecondInputAsMaximum") {
    val maximum3Variables = new  Maximum3Variables()
    assert(maximum3Variables.maximumOf3NumbersInt(5,7,6) === 7)
  }

  test("MaximumInputNumberAtThirdFollowedByFirstAndSecondInput_ReturnThirdInputAsMaximum") {
    val maximum3Variables = new  Maximum3Variables()
    assert(maximum3Variables.maximumOf3NumbersInt(2,6,8) === 8)
  }

}
