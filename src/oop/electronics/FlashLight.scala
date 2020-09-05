package oop.electronics

class FlashLight() extends Electronic() {
  override var battery: Battery = new Battery(5)
  override def use(): Unit = {
    if (battery.charge >= 1) {
      battery.charge -= 1
    }
  }
}