package functions

object Generics {
  def genericMethod[Type](lists: List[Int], parameters: (Int) => Type): List[Type] = {
    var newlists: List[Type] = List()
    for(x <- lists) {
      newlists = newlists :+ parameters(x)
    }
    newlists
  }

  def averageInRange(number: List[Double]) = (min: Double, max: Double) => {
    number.filter(x => (x > min && x < max)).sum / number.filter(x => (x > min && x < max)).size
  }
}
