name := "$name$"
version := "0.1.0-SNAPSHOT"

scalaVersion := "3.1.0"

// ORACLE JDBC
libraryDependencies += "com.oracle.database.jdbc" % "ojdbc10" % "19.11.0.0"

// test framework
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
