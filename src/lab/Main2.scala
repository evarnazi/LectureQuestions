package lab

object Main2 {
  def getFunction(a: Int): (List[String], Int) => String = {
    (b: List[String], c: Int) => {
      b.reduce ((acc: String, s: String) =>{
        if( s.length > c-a){
          acc + ", " + s
        }else{
          acc
        }
      })
    }
  }

  def main (args: Array[String]): Unit = {
    val newFunction: (List[String], Int) => String = getFunction(10)

    println(newFunction(List("Online", "only", "course"), 14))
  }

}
