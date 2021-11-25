name := "$name$"
version := "0.1.0-SNAPSHOT"

scalaVersion := "3.1.0"

$if(oracle-access-required.truthy)$
// ORACLE JDBC
libraryDependencies += "com.oracle.database.jdbc" % "ojdbc10" % "19.11.0.0"
$endif$

// test framework
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
