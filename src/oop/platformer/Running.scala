
package oop.platformer

class Running(action: Player) extends State(action) {
  override def duck(): Unit = {
    println("No transition.")
  }
  override def standStill(): Unit = {
    action.state = new Standing(action)
  }
  override def run(): Unit = {
    println("Running.")
  }
  override def jumpHeight(): Unit = {
    action.jumHeight = 6
  }
  override def movementSpeed(): Unit = {
    action.movemSpeed = 12
  }
}