
// https://eax.me/scala-sbt/

name    := "Skala"

version := "0.0.1"

scalaVersion := "2.12.7"

// mainClass := Some("metaL")

mainClass in (Compile, run) := Some("metaL.metaL")

//libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.1.1"
//libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"

scalaSource in Compile := baseDirectory.value / "src"

// javaSource in Compile := baseDirectory.value / "src" / "jx"

//libraryDependencies ++= Seq(
//    "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.4",
//    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
//    "org.foobar" %% "foobar" % "1.8"
//)
