
import sbt.Keys._

lazy val commonSettings = Seq(
  version := "1.0",
  name := "otus-homework",
  scalaVersion := "2.11.8"
)

lazy val commonDependencies = Seq(

  "org.apache.spark" %% "spark-core" % "2.3.1",
  "org.apache.spark" %% "spark-sql" %"2.3.1",
  "org.apache.spark" %% "spark-yarn" % "2.3.1" // for remote debug

)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= commonDependencies,
  ).
  enablePlugins(AssemblyPlugin)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

assemblyJarName in assembly := "otus-homework_2.11-1.0.jar"




