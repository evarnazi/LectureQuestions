package oop.electronics

abstract class Electronic() {
  var battery: Battery
  def use(): Unit = {

  }
  def replaceBattery(CLASS: Battery): Battery = {
    val curr = this.battery
    this.battery = CLASS
    curr
  }
}
