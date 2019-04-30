package frame

import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer

class Frame(T: String = "frame", V: String) {
  
                                                              /** type/class tag */ 
  val typez = T
                                                              /** implementation language type primitive value */
  var value = V
                                                              /** attributes = slots = associative array */
  var slot  = Map[String, Frame]()
                                                              /** nested elements = vector = stack */
  var nest  = ArrayBuffer[Frame]()
  
  override def toString = dump()
                                                              /** short object dump in <type:value> form */
  def head(prefix:String = "") = 
    s"$prefix<$typez:$value>"
                                                              /** left pad for tree dump */
  def pad(N: Int) = "\n" + "\t" * N
                                                              /** dump in full tree form */
  def dump(depth: Int = 0, prefix: String = ""): String = {
    var T = pad(depth) + head(prefix)
    for ((k, v) <- slot) T += v.dump(depth + 1, prefix = s"$k = ")
    for (    j  <- nest) T += j.dump(depth + 1)
    return T
  }
  
                                                              /** push object as slot with same name `A.B = B` */    
  def <<(obj: Cmd) = {
    slot(obj.value) = obj ; this }
  
}