/*
package emc

// https://habr.com/ru/post/325446/

import scala.util.parsing.combinator._

class Lexer extends RegexParsers {
  
  def sign: Parser[Any] = "+" | "-" | "*"

  def num : Parser[Any] = "[0-9]+".r ^^ {_.toInt}
  
}

object Go extends Lexer with App {
  
  println( sign )
  println( num  )
  
  println(parseAll(num,"01 02.30 +1.23"))
  
}
*/
