name := "scala-repository"

version := "0.1"

scalaVersion := "2.12.6"

sbtVersion := "0.13.13"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.9.0",
  "org.scalaj" %% "scalaj-http" % "2.4.2"
)