package linux

object hello {

	hello_c.hello()                           //> java.lang.UnsatisfiedLinkError: linux.hello_cJNI.hello()V
                                                  //| 	at linux.hello_cJNI.hello(Native Method)
                                                  //| 	at linux.hello_c.hello(hello_c.java:13)
                                                  //| 	at linux.hello$.$anonfun$main$1(linux.hello.scala:5)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at linux.hello$.main(linux.hello.scala:3)
                                                  //| 	at linux.hello.main(linux.hello.scala)

}