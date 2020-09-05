package oop.car

class Drive(car: Car) extends State(car: Car) {

  override def shiftToDrive(): Unit = {
    println("Drive.")
  }

  override def shiftToPark(): Unit = {
    println("Drive.")
  }

  override def shiftToReverse(): Unit = {
    println("Drive.")
  }

  override def accelerate(): Unit = {
    car.speed += 10
  }

  override def brake(): Unit = {
    car.speed = 0
    car.state = new Drive2(car)
  }

  override def velocity(): Unit = {
    car.speed = car.speed
  }
}
