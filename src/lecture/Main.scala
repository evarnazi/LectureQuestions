package lecture

object Main {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(0, 0)
    val p2 = p1.translate(1,2).translate(3,1)
    val p3 = p1.translate(0,0)

    println("(" + p2.x + ", " + p2.y + ")")


  }
}
