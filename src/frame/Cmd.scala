package frame

/** virtual machine command implemented in Scala */
class Cmd(T: String ="cmd", V: String, fn: (VM) => Unit) extends Active(T, V)
