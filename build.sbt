import scalariform.formatter.preferences._

val scalaVersion_2_11 = "2.11.12"
val scalaVersion_2_12 = "2.12.8"
val scalaVersion_2_13 = "2.13.1"

name := """play-json-naming"""

version := "1.3.0"

scalaVersion := scalaVersion_2_13

crossScalaVersions := Seq(scalaVersion_2_11, scalaVersion_2_12, scalaVersion_2_13)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.7.4" % "provided",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

organization := "com.github.tototoshi"

scalariformPreferences := scalariformPreferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentConstructorArguments, true)
  .setPreference(DanglingCloseParenthesis, Preserve)

publishMavenStyle := true

publishTo := Some("S3 Artifacts" at "s3://homebay-artifacts/ext-releases-local")

publishArtifact in Test := false

pomExtra := 
  <url>https://github.com/tototoshi/play-json-naming</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>https://github.com/tototoshi/play-json-naming/blob/master/LICENSE.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:tototoshi/play-json-naming.git</url>
    <connection>scm:git:git@github.com:tototoshi/play-json-naming.git</connection>
  </scm>
  <developers>
    <developer>
      <id>tototoshi</id>
      <name>Toshiyuki Takahashi</name>
      <url>https://tototoshi.github.com</url>
    </developer>
  </developers>
