import _root_.play.PlayScala

// give the user a nice default project!



lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies += "com.softwaremill.macwire" %% "macros" % "0.7"

libraryDependencies += "com.softwaremill.macwire" %% "runtime" % "0.7"
