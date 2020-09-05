package lecture
import util.control.Breaks._

object Algebra {
  def isPrime(num: Int): Boolean = {
    for (i <- 2 to num-1){
      if (num % i == 0){
        return false
      }
    }
    true
  }
  def factor(num: Int): List[Int] = {
    var numList: List[Int] = List()
    if (num <= 0){
      numList = List()
    }
    else if (num == 1){
      numList = numList :+ 1
    }
    else if (isPrime(num)){
      numList = numList :+ num
    }
    else{
      var x: Int = num
      while(!isPrime(x)){
        breakable{
          for (i <- 2 to x-1) {
            if (x % i == 0) {
              numList = numList :+ i
              x = x / i
              println(i)
              println(x)
              break
            }
          }
        }
      }
      numList = numList :+ x
    }
    numList
  }
}