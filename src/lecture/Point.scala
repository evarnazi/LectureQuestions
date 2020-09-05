package lecture

class Point (val x: Int, val y: Int) {

  def translate(dx: Int, dy: Int): Point = {
    new Point(this.x + dx, this.y + dy)
  }
}

