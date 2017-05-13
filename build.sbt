name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

// https://mvnrepository.com/artifact/org.sorm-framework/sorm
libraryDependencies += "org.sorm-framework" % "sorm" % "0.3.21"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.4"

// Redis dependencies
libraryDependencies += "com.typesafe.play.modules" %% "play-modules-redis" % "2.5.0"

resolvers += "google-sedis-fix" at "http://pk11-scratch.googlecode.com/svn/trunk"




