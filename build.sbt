organization := "reaktor"

name := "sbt-scct"

version := "0.2-SNAPSHOT"

scalaVersion := "2.9.2"

crossScalaVersions := Seq("2.9.2", "2.9.1-1", "2.9.1", "2.9.0-1", "2.9.0")

sbtPlugin := true

resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

// For local development:
//resolvers += "scct-repository" at "file:///Users/mtkopone/projects/scct/gh-pages/maven-repo"

libraryDependencies += "reaktor" %% "scct" % "0.2-SNAPSHOT"

publishTo := Some(Resolver.file("file",  new File("../gh-pages/maven-repo")))

