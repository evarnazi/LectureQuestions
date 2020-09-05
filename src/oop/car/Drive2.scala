package oop.car

class Drive2(car: Car) extends State(car: Car){
  override def shiftToDrive(): Unit = {

  }
  override def shiftToPark(): Unit = {
    car.state = new Park(car)
  }
  override def shiftToReverse(): Unit = {

  }
  override def accelerate(): Unit = {
    car.state = new Drive(car)
    car.state.accelerate()
  }
  override def brake(): Unit = {

  }
  override def velocity(): Unit = {

  }
}