ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.12.20"

val PekkoVersion = "1.1.2"
val elastic4sVersion8 = "8.15.0"
lazy val pekkoActor = "org.apache.pekko" %% "pekko-actor" % PekkoVersion
lazy val pekkoActorTyped = "org.apache.pekko" %% "pekko-actor-typed" % PekkoVersion

lazy val pekkoStream = "org.apache.pekko"              %% "pekko-stream" % PekkoVersion
lazy val elastic4sCore = "nl.gn0s1s" %% "elastic4s-core" % elastic4sVersion8
lazy val root = (project in file("."))
  .settings(
    name := "elastic4s-pekko-http-stream",
    libraryDependencies ++= Seq(pekkoActor, pekkoActorTyped, pekkoStream, elastic4sCore)
  )
