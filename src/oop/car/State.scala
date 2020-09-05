package oop.car

abstract class  State(car:Car){
  def shiftToDrive()
  def shiftToPark()
  def shiftToReverse()
  def accelerate()
  def brake()
  def velocity()
}
