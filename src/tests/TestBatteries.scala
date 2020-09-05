package tests

import org.scalatest._
import execution.{Battery, BoomBox, FlashLight}

class TestBatteries extends FunSuite{
  test("test") {
    var battery: Battery = new Battery(10)
    var battery2: Battery = new Battery(5)
    var battery3: Battery = new Battery(1)
    var boombox: BoomBox = new BoomBox(battery)
    var boombox2: BoomBox = new BoomBox(battery3)
    var flashLight: FlashLight = new FlashLight()
    var battery4: Battery = new Battery(3)
    val batteryF: Battery = flashLight.battery
    assert(boombox.battery == battery)
    boombox.use()
    assert(battery.charge == 7)
    assert(boombox.replaceBattery(battery2) == battery)
    assert(boombox.battery == battery2)
    boombox2.use()
    assert(battery3.charge == 1)
    assert(boombox2.replaceBattery(battery2) == battery3)
    assert(flashLight.battery == batteryF)
    assert(flashLight.battery.charge == 5)
    flashLight.use()
    assert(flashLight.battery.charge == 4)
    assert(flashLight.replaceBattery(battery4) == batteryF)
    assert(flashLight.battery == battery4)
    flashLight.use()
    flashLight.use()
    flashLight.use()
    flashLight.use()
    flashLight.use()
    flashLight.use()
    flashLight.use()
    assert(flashLight.battery.charge == 0)
    flashLight.use()
    assert(flashLight.battery.charge == 0)
  }
}