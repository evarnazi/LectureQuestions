package oop.json

import play.api.libs.json.{JsValue, Json}

class Store(var cashInRegister: Double, var inventory: List[String]) {
  def asJSON(): String = {
    val jsonCashInRegister: JsValue = Json.toJson(cashInRegister)
    val jsonInventory: JsValue = Json.toJson(inventory)

    val map: Map[String, JsValue] = Map(
      "cashInRegister" -> jsonCashInRegister,
      "inventory" -> jsonInventory)

    val jsonString: JsValue = Json.toJson(map)

    Json.stringify(jsonString)
  }
  def fromJSON(jsonString: String): Unit = {
    val parsed: JsValue = Json.parse(jsonString)
    cashInRegister = (parsed \ "cashInRegister").as[Double]
    inventory = (parsed \ "inventory").as[List[String]]
  }
}