package functions

object Algebra {

  def factor(number: Int): List[Int] = {
    val nullLis: List[Int] = List()
    if (number <= 1) {
      nullLis
    }
    else {
      val lists: List[Int] = (for (n <- 2 until number if number % n == 0) yield n).toList
      if(lists.isEmpty){
        List(number)
      }
      else{
        val newnum: Int = lists.head
        val newNum:Int = number / newnum
        val list2: List[List[Int]] = List(List(newnum), factor(newNum))
        list2.flatten
      }}}}