package metaL

import frame._
import linux._

object metaL {
  
  val hello = new Frame("hello", "world")

  def main(args: Array[String]) = {
    for (a <- args) println(a)
    
    hello_c.hello() 
  }

}