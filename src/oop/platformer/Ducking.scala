package oop.platformer

class Ducking (action: Player) extends State(action) {
  override def duck(): Unit = {
    println("Ducking.")
  }
  override def standStill(): Unit = {
    action.state = new Standing(action)
  }
  override def run(): Unit = {
    println("No transition.")
  }
  override def jumpHeight(): Unit = {
    action.jumHeight = 4
  }
  override def movementSpeed(): Unit = {
    action.movemSpeed = 1
  }
}