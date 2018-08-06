val Specs2Version = "4.0.2"

lazy val root = (project in file("."))
  .settings(
    organization := "io.github.spf3000",
    name := "listings-api",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      "org.specs2"      %% "specs2-core"         % Specs2Version % "test",
      "com.slamdata" 	%% "matryoshka-core"	 % "0.18.3",
    )
  )

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")
libraryDependencies += "org.typelevel" %% "spire" % "0.14.1"

