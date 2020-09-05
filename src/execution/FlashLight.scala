package execution

class FlashLight() {
  var battery: Battery = new Battery(5)
  def use(): Unit = {
    if (battery.charge > 0) {
      battery.charge -= 1
    }
  }
  def replaceBattery(CLASS: Battery): Battery = {
    val curr = battery
    battery = CLASS
    curr
  }
}