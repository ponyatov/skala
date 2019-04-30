package frame

class Cmd(V: String, fn: (VM) => Unit) extends Active("cmd", V) {}
