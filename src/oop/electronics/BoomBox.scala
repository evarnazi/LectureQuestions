package oop.electronics

class BoomBox(var CLASS: Battery) extends Electronic() {
  override var battery: Battery = CLASS
  override def use(): Unit = {
    if (CLASS.charge >= 3) {
      CLASS.charge -= 3
    }
  }
}