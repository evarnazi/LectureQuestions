package tests

import org.scalatest.FunSuite
import oop.json.Store

class TestSubmission extends FunSuite {

  val EPSILON: Double = 0.000001
  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("test the store JSON") {
    val store: Store = new Store(550.21, List("eggs", "milk", "waffles"))
    val storeJSON: String = store.asJSON()

    val store2: Store = new Store(0.0, List())
    store2.fromJSON(storeJSON)

    assert(equalDoubles(store.cashInRegister, 550.21))
    val actualList: List[String] = store.inventory.sorted
    val expectedList: List[String] = List("eggs", "milk", "waffles").sorted

    assert(actualList == expectedList)
  }
}