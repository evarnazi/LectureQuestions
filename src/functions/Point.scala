package functions

class Point(val x: Double, val y: Double) {
  def add(pt: Point): Point = {
    val newX: Double = this.x + pt.x
    val newY: Double = this.y + pt.y
    new Point(newX, newY)
  }

  def multiplyByScalar(mul: Double): Point = {
    val newX: Double = this.x * mul
    val newY: Double = this.y * mul
    new Point(newX, newY)
  }
}