package tests

import oop.electronics.{Battery, BoomBox, FlashLight, UseElectronics}
import org.scalatest._


class TestElectronics extends FunSuite{
  test("test") {
    val batteries: Battery = new Battery(10)
    val boomBox: BoomBox = new BoomBox(batteries)
    val flashLight: FlashLight = new FlashLight()
    assert(batteries.charge == 10)
    assert(flashLight.battery.charge == 5)
    UseElectronics.useAll(List(boomBox, flashLight))
    assert(batteries.charge == 7)
    assert(flashLight.battery.charge == 4)


    val flashLights: Battery = flashLight.battery
    val boomBoxs: Battery = boomBox.battery
    UseElectronics.swapBatteries(boomBox, flashLight)
    assert(flashLight.battery == boomBoxs)
    assert(boomBox.battery == flashLights)

  }
}