package oop.car

class Reverse(car: Car) extends State(car: Car) {
  override def shiftToDrive(): Unit = {
    println("Reverse.")
  }
  override def shiftToPark(): Unit = {
    println("Reverse.")
  }
  override def shiftToReverse(): Unit = {
    println("Reverse")
  }
  override def accelerate(): Unit = {
    car.speed -= 5
  }
  override def brake(): Unit = {
    car.speed = 0
    car.state = new Reverse2(car)
  }
  override def velocity(): Unit = {
    car.speed = car.speed
  }
}