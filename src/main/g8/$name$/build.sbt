name := "$name$"
version := "0.1.0-SNAPSHOT"

scalaVersion := "3.1.0"

$if (oracle)$
// ORACLE JDBC
libraryDependencies += "com.oracle.database.jdbc" % "ojdbc10" % "19.11.0.0"
$endif$

/*
* TEST DEPENDENCIES
*/
// framework
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"

// mocks
libraryDependencies += "org.scalamock" %% "scalamock" % "5.1.0" % "test"

// property based testing
libraryDependencies += "org.scalatestplus" %% "scalacheck-1-15" % "3.2.10.0" % "test"

