package hw.mcu

import emc.hw.mcu.MCU

/** AVR ATmega */
class AVR8(T:String="avr8",V:String) extends MCU(T,V)

class    ATtiny(T:String="attiny"   ,V:String) extends      AVR8(T,V) { val hz=8; }

class  ATtiny44(T:String="attiny44" ,V:String) extends    ATtiny(T,V) { val ram=256 ; val flash=4 ; val gpio=11 }
class  ATtiny84(T:String="attiny84" ,V:String) extends    ATtiny(T,V) { val ram=512 ; val flash=8 ; val gpio=11 }
class  ATtiny45(T:String="attiny45" ,V:String) extends    ATtiny(T,V) { val ram=256 ; val flash=4 ; val gpio= 5 }
class  ATtiny85(T:String="attiny85" ,V:String) extends    ATtiny(T,V) { val ram=512 ; val flash=8 ; val gpio= 5 }

class    ATmega(T:String="atmega"   ,V:String) extends      AVR8(T,V)
class   ATmega8(T:String="atmega8"  ,V:String) extends    ATmega(T,V)
class  ATmega16(T:String="atmega16" ,V:String) extends   ATmega8(T,V)
class  ATmega32(T:String="atmega32" ,V:String) extends  ATmega16(T,V)
class  ATmega64(T:String="atmega64" ,V:String) extends  ATmega32(T,V)
class ATmega128(T:String="atmega128",V:String) extends  ATmega64(T,V)
class ATmega256(T:String="atmega256",V:String) extends ATmega128(T,V)
