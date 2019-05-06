package emc

import frame.{Lang, Compiler}

/** embedded C */
class emC(T: String = "emC", V: String) extends Lang(T, V)

/** ANSI C89 */
class C89(T: String = "c89", V: String) extends emC(T, V)

/** C compiler */
class CC(T: String = "cc", V: String) extends Compiler(T, V)

/** GNU C compiler */
class GCC(T: String = "gcc", V: String) extends CC(T, V)
