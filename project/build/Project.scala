import sbt._

class RomanNumeralsProject(info: ProjectInfo) extends DefaultProject(info)
{
    val specs = "org.scala-tools.testing" %% "specs" % "1.6.7" % "test->default"
    val scalacheck = "org.scala-tools.testing" %% "scalacheck" % "1.8" % "test->default"
}
