package execution

class VoteCounter (var votingName: List[String]) {
  var answerKey: Map[String, Int] = Map()
  def addVotes(str: String, int: Int): Unit = {
    if (answerKey.contains(str)) {
      val temp: Int = answerKey(str)
      answerKey -= str
      answerKey += (str -> (int+temp))
    }
    else {
      answerKey += (str -> int)
    }
  }
  def getVotes(str: String): Int = {
    if (answerKey.contains(str) && votingName.contains(str)) {
      answerKey(str)
    }
    else {
      0
    }
  }
}
