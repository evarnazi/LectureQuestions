package oop.platformer

class Standing(action: Player) extends State(action) {
  override def duck(): Unit = {
    action.state = new Ducking(action)
  }
  override def standStill(): Unit = {
    println("Standing.")
  }
  override def run(): Unit = {
    action.state = new Running(action)
  }
  override def jumpHeight(): Unit = {
    action.jumHeight = 3
  }
  override def movementSpeed(): Unit = {
    action.movemSpeed = 5
  }
}