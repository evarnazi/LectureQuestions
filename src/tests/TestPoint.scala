package tests

import functions.Point
import org.scalatest._

class TestPoint extends FunSuite{
  test("test"){
    val epsilon: Double = 0.000001
    val pt1: Point = new Point(5.0, 10.0)
    val pt2: Point = new Point(3.0, -4.0)
    val newPt1: Point = pt1.add(pt2)
    val newPt2: Point = pt2.multiplyByScalar(5.0)
    assert(pt1.x == 5.0 && pt1.y == 10.0)
    assert(newPt1.x == 8.0 && newPt1.y == 6.0)
    assert(pt1.x ==5.0 && pt1.y == 10.0)
    assert(pt2.x == 3.0 && pt2.y == -4.0)
    assert(newPt2.x == 15.0 && newPt2.y == -20.0)
    assert(pt2.x == 3.0 && pt2.y == -4.0)

  }
}