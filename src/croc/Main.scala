package croc

/* sum n numbers */

/*
object Main {
  def main(args: Array[String]) = {
    val scanner = new java.util.Scanner(System.in)
    val count = scanner.nextInt()
    var sum   = 0
    (1 to count).foreach( (_) => sum += scanner.nextInt() )
    println(sum)
  }
}
*/

/* hotel rating assigning */

class Hotel(val rating: Int, stars:Int =0) {
  override def toString = s"$rating:$stars"
  def <(h:Hotel) = rating < h.rating
  def >(h:Hotel) = rating > h.rating
}

import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]) = {
    
    val scanner = new java.util.Scanner(System.in)
    
    val count = scanner.nextInt()
    assert(count % 5 == 0)
    
    var hotel = ArrayBuffer.tabulate(count)( _ => new Hotel(scanner.nextInt()) )
    
    var starpool = ArrayBuffer.fill(5)(count/5)
    
    var assigned = ArrayBuffer[Hotel]()
    
    println(hotel)
    println(starpool)
    
    var min = hotel(0)
    var max = hotel(0)
    
    for (h <- hotel) {
      if (h < min) min = h
      if (h > max) max = h
    }
    
    println(min,max)
    
    
  }
}
