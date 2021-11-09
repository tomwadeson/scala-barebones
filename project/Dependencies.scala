import sbt._

object Dependencies {

  val catsCore = "org.typelevel" %% "cats-core" % "2.6.1"
  val munit = "org.scalameta" %% "munit" % "0.7.29" % Test

  object CompilerPlugins {

    val kindProjector =
      compilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)

    val betterMonadicFor =
      compilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")

    val all =
      Seq(
        kindProjector,
        betterMonadicFor
      )
  }
}
