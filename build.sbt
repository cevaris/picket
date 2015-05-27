name := "picket"

version := "0.1"

scalaVersion := "2.11.6"

resolvers ++= Seq(
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
)

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging"  % "3.1.0",
  "ch.qos.logback"             % "logback-classic" % "1.1.2",
  "com.typesafe.akka"          %% "akka-actor"     % "2.3.10",
  "joda-time"                  % "joda-time"       % "2.7",
  "org.joda"                   % "joda-convert"    % "1.2",
  "org.scalacheck"             %% "scalacheck"     % "1.12.3" % "test",
  "org.scalatest"              %% "scalatest"      % "2.2.4" % "test",
  "org.scala-lang"             % "scala-xml"       % "2.11.0-M4",
  "org.slf4j"                  % "slf4j-api"       % "1.7.10"
)
