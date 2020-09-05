package actor
import akka.actor._

case object GetValue
case class Append(x: String)
case class Value(y:String)

class StringActor(a: String) extends Actor {
  var current: String = a
  def receive: Receive = {
    case append: Append => current += append.x
    case value: Value => println(value.y)
    case GetValue => sender() ! Value(current)
  }
}
