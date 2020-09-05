package tests

import org.scalatest._
import functions.Generics

class TestGenerics extends FunSuite {
  test("test") {
    val newList: List[Int] = List(-5,20,1,-1,0)
    val positiveVal: Int => Boolean = (x: Int) => x>0
    val negativeVal: Int => Boolean = (x: Int) => x<=0
    val value: List[Boolean] = Generics.genericMethod(newList, positiveVal)
    val value1: List[Boolean] = Generics.genericMethod(newList, negativeVal)
    assert(value != List(true, false, false, true, true))
    assert(value == List(false, true, true, false, false))
    assert(value1 == List(true, false, false, true, true))
    assert(value1 != List(false, true, true, false, false))

  }
}