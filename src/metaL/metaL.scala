package metaL

import frame._

object metaL {
  
  val hello = new Frame("hello", "world")

  def main(args: Array[String]) = {
    for (a <- args) println(a)
  }

}