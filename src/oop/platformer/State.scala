package oop.platformer

abstract class State(action: Player) {
  def duck()
  def standStill()
  def run()
  def jumpHeight()
  def movementSpeed()
}