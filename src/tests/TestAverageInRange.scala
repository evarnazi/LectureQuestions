package tests

import org.scalatest._
import functions.Numbers

class TestAverageInRange extends FunSuite{
  test("test") {
    val lists: List[Double] = List(3.0, 4.0, 5.0, 6.0, 7.0, 8.0)
    val one: (Double, Double) => Double = Numbers.averageInRange(lists)
    assert(one(3.0, 8.0) ==5.5)
    assert(one(4.0, 7.0) == 5.5)
    assert(one(3.0, 6.0) == 4.5)
    assert(one(5.0, 8.0) ==6.5)
    assert(one(3.0, 7.0) != 2.0)
    val lists2: List[Double] = List(6.0, 12.0)
    val two: (Double, Double) => Double = Numbers.averageInRange(lists2)
    assert(two(6.0, 12.0) != 1.0)
  }}