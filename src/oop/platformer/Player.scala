package oop.platformer

class Player {
  var state: State = new Standing(this)
  var jumHeight: Int = 0
  var movemSpeed: Int = 0
  def duck(): Unit = {
    this.state.duck()
  }
  def standStill(): Unit = {
    this.state.standStill()
  }
  def run(): Unit = {
    this.state.run()
  }
  def jumpHeight(): Int = {
    this.state.jumpHeight()
    jumHeight
  }
  def movementSpeed(): Int = {
    this.state.movementSpeed()
    movemSpeed
  }

}
