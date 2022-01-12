addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
scalafmtConfig := file(".scalafmt.conf")

addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.7")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.2")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.34")
