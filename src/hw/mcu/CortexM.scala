package hw.mcu

import emc.hw.mcu.MCU

/** Cortex-M */
class CortexM(T:String="cortexM",V:String) extends MCU(T,V)

class CortexM0(T:String="cortexM0",V:String) extends CortexM(T,V)
class CortexM1(T:String="cortexM1",V:String) extends CortexM0(T,V)
class CortexM3(T:String="cortexM3",V:String) extends CortexM1(T,V)
class CortexM4(T:String="cortexM4",V:String) extends CortexM3(T,V)
class CortexM7(T:String="cortexM7",V:String) extends CortexM4(T,V)
class CortexH7(T:String="cortexH7",V:String) extends CortexM7(T,V)

class CortexL0(T:String="cortexL0",V:String) extends CortexM0(T,V)
