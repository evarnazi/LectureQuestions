package oop.electronics

object UseElectronics {
  def useAll(lists: List[Electronic]): Unit = {
    for (electronic <- lists) {
      electronic.use()
    }
  }
  def swapBatteries(CLASS: Electronic, CLASS1: Electronic): Unit = {
    val curr: Battery = CLASS1.replaceBattery(CLASS.battery)
    CLASS.battery = curr
  }
}