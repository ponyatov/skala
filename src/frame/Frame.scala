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
  
  override def toString = head()
                                    /** short object dump in <type:value> form */
  def head(prefix:String = "") = 
    s"$prefix<$typez:$value>"
  
}