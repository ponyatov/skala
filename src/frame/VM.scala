package frame

/** virtual machine incapsulates computation state and operations lookup table  */
class VM(V: String) extends Active("vm", V) {
                                                            /** data computation stack */
  val S = new Stack("DATA")
                                                            /** operations vocabulary */
  val W = new Dict("VOC")

}
