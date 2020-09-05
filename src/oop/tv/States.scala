package oop.tv

abstract class States(tv: TV) {
  def volumeUp()
  def volumeDown()
  def mute()
  def power()
  def currentVolume()
}
