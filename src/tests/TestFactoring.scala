package tests

import org.scalatest._
import functions.Algebra

class TestFactoring extends FunSuite {
  test("tests") {
    val testCases: Map[Int, List[Int]] = Map(
      12 -> List(2,2,3),
      8 -> List(2,2,2),
      6 -> List(2, 3),
      0 -> List(),
      1 -> List(),
      -5 -> List())
    for ((input, expectedOutput) <- testCases) {
      assert(Algebra.factor(input) == expectedOutput)
    }
  }
}