package frame

import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer
import scala.ref.WeakReference

/** generic frame 
 *  @param T type/class tag
 *  @param V primitive value /implementation language type/
 *  */

class Frame(val T: String = "frame", var V: String) {
  
                                                                    /** attributes = slots = associative array */
  var slot  = Map[String, Frame]()
                                                                    /** nested elements = vector = stack */
  var nest  = ArrayBuffer[Frame]()

                                                                    /** short object dump in <type:value> form */
  def head(prefix:String = "") =
    s"$prefix<T:V> @$WeakReference(this)"
                                                                    /** left pad for tree dump */
  def pad(N: Int): String = "\n" + "\t" * N
                                                                    /** dump in full tree form */
  def dump(depth: Int = 0, prefix: String = ""): String = {
    var tmp = pad(depth) + head(prefix)
    for ((k, v) <- slot) tmp += v.dump(depth + 1, prefix = s"$k = ")
    for (    j  <- nest) tmp += j.dump(depth + 1)
    return tmp
  }

  override def toString = dump()

                                                                    /** push object as slot with same name `A.B = B` */
  def <<(obj: Cmd) = {
    slot(obj.V) = obj ; this }

}