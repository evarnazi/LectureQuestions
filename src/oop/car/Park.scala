
package oop.car

class Park(car: Car) extends State(car: Car) {
  override def shiftToDrive(): Unit = {
    car.state = new Drive(car)
  }
  override def shiftToPark(): Unit = {
    println("Park.")
  }
  override def shiftToReverse(): Unit = {
    car.state = new Reverse(car)
  }
  override def accelerate(): Unit = {
    println("Park.")
  }
  override def brake(): Unit = {
    println("Park.")
  }
  override def velocity(): Unit = {
    car.speed = 0
  }
}
