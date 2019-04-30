package metaL

import frame._

object metaL {
  
  val hello = new Frame("hello", "world")
  
  var vm = new VM("FORTH")
  
  vm << new Cmd("NOP",(vm)=>{})

  def main(args: Array[String]) = {
    for (a <- args) println(a)
    
    println(vm)
    
  }

}