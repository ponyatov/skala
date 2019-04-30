package swig

object hello {

	hello_c.hello()                           //> java.lang.UnsatisfiedLinkError: swig.hello_cJNI.hello()V
                                                  //| 	at swig.hello_cJNI.hello(Native Method)
                                                  //| 	at swig.hello_c.hello(hello_c.java:13)
                                                  //| 	at swig.hello$.$anonfun$main$1(swig.hello.scala:5)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at swig.hello$.main(swig.hello.scala:3)
                                                  //| 	at swig.hello.main(swig.hello.scala)

}