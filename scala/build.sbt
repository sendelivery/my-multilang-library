ThisBuild / scalaVersion := "2.13.12"
ThisBuild / organization := "com.example"

lazy val RooMarkets = project
    .in(file("."))
    .settings(
        name := "RooMarkets",
        libraryDependencies ++= Seq(
            "org.scalatest" %% "scalatest" % "3.2.16" % Test
        )
  )