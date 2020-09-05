package execution

class TradeAgreement (var first: Trader, var second: Trader) {
  var opinion: Boolean = false
  def executeTrade(): Unit = {
    if (!opinion) {
      val temp: Valuable = first.item
      first.item = second.item
      second.item = temp
      opinion = true
    }
  }
}
