import sbt._

object Dependencies {

  val catsCore = "org.typelevel" %% "cats-core" % "2.1.1"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.1.4"
  
  object CompilerPlugins {
    val kindProjector =
      compilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3")

    val betterMonadicFor =
      compilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")

    val silencer = {
      val version = "1.4.1"
      Seq(
        compilerPlugin("com.github.ghik" %% "silencer-plugin" % version),
        "com.github.ghik" %% "silencer-lib" % version % Provided
      )
    }

    val all =
      Seq(
        kindProjector,
        betterMonadicFor
      ) ++ silencer
  }
}
