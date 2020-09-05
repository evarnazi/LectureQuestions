package oop.tv

class Muted(tv: TV) extends States(tv: TV) {
  override def volumeUp(): Unit = {
    tv.state = new On(tv)
    tv.curr = tv.curr2
  }
  override def volumeDown(): Unit = {
    tv.state = new On(tv)
    tv.curr = tv.curr2
  }
  override def mute(): Unit = {
    tv.state = new On(tv)
    tv.curr = tv.curr2
  }
  override def power(): Unit = {
    tv.state = new Off(tv)
  }
  override def currentVolume(): Unit = {
    tv.volume = tv.curr
  }
}
