addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.4")
scalafmtConfig := file(".scalafmt.conf")

addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.11.1")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.3.1")

addSbtPlugin("com.github.sbt" % "sbt-git" % "2.1.0")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.2")
