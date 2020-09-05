package tests

import org.scalatest._
import execution.{TradeAgreement, Trader, Valuable}

class TestTrading extends FunSuite{
  test("Test") {
    val valuable1: Valuable = new Valuable()
    val test1: Trader = new Trader(valuable1)
    val valuable2: Valuable = new Valuable()
    val test2: Trader = new Trader(valuable2)
    val valuable3: Valuable = new Valuable()
    val agreement: TradeAgreement = new TradeAgreement(test1, test2)
    agreement.executeTrade()
    assert(test1.item != valuable1)
    assert(test2.item != valuable2)
    assert(test1.item != valuable3)
    assert(test1.item == valuable2)
    assert(test2.item == valuable1)
    agreement.executeTrade()
    assert(test1.item != valuable1)
    assert(test2.item != valuable2)
    assert(test1.item != valuable3)
    assert(test1.item == valuable2)
  }
}
