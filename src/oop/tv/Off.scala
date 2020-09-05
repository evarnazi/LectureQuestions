package oop.tv

class Off(tv: TV) extends States(tv: TV) {
  override def volumeUp(): Unit = {
    println("Off.")
  }
  override def volumeDown(): Unit = {
    println("Off.")
  }
  override def mute(): Unit = {
    println("Off.")
  }
  override def power(): Unit = {
    tv.state = new On(tv)
    tv.curr = tv.curr2
  }
  override def currentVolume(): Unit = {
    tv.volume = 0
  }
}
