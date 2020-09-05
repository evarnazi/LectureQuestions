package oop.tv

class TV() {
  var state: States = new Off(this)
  var volume: Int = 5
  var curr: Int = 5
  var curr2: Int = 5
  def volumeUp(): Unit = {
    this.state.volumeUp()
  }
  def volumeDown(): Unit = {
    this.state.volumeDown()
  }
  def mute(): Unit = {
    this.state.mute()
  }
  def power(): Unit = {
    this.state.power()
  }
  def currentVolume(): Int = {
    this.state.currentVolume()
    this.volume
  }
}