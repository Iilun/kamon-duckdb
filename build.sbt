import kamon.instrumentation.sbt.SbtKanelaRunner.Keys.kanelaVersion

val kamonVersion = "2.7.5"

scalaVersion := "2.13.15"

libraryDependencies ++= Seq(
  evolutions,
  guice,
  jdbc,
  "io.kamon" %% "kamon-bundle" % kamonVersion,
  "org.duckdb" % "duckdb_jdbc" % "1.1.3"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala, JavaAgent).settings(
  javaAgents := Seq("io.kamon" % "kanela-agent" % kanelaVersion.value),
)
