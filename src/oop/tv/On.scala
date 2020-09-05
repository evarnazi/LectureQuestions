package oop.tv

class On(tv: TV) extends States(tv: TV) {
  override def volumeUp(): Unit = {
    tv.curr = Math.min(10,tv.curr+1)
  }
  override def volumeDown(): Unit = {
    tv.curr = Math.max(0,tv.curr-1)
  }
  override def mute(): Unit = {
    tv.state = new Muted(tv)
    tv.curr2 = tv.curr
    tv.curr = 0
  }
  override def power(): Unit = {
    tv.state = new Off(tv)
    tv.curr2 = tv.curr
  }
  override def currentVolume(): Unit = {
    tv.volume = tv.curr
  }
}