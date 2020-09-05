package functions

object Numbers {
  def fib(number: Int): Int = {
    if (number < 3) {
      val ans: Int = 1
      ans
    }
    else {
      val one: Int = fib(number - 2)
      val two: Int = fib(number - 1)
      val tot: Int = one + two
      tot
    }}

  def averageInRange(lists: List[Double]): (Double, Double) => Double = {
    (one: Double, two: Double) => {
      val list1: List[Double] = lists.filter(_ > one)
      val list2: List[Double] = list1.filter(_ < two)
      val totlist: (Double, Double) => Double = (x: Double, y: Double) => x + y
      if(list2.nonEmpty){
        list2.reduce(totlist) / list2.length
      }
      else{
        0.0
      }}}}

