package execution

class BoomBox(var battery: Battery) {
  def use(): Unit = {
    if (battery.charge >= 3) {
      battery.charge -= 3
    }
  }
  def replaceBattery(CLASS: Battery): Battery = {
    val curr = battery
    battery = CLASS
    curr
  }
}
