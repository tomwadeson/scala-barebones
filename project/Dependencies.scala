import sbt._

object Dependencies {

  val silencerVersion = "1.4.1"

  val silencerLib = "com.github.ghik" %% "silencer-lib" % silencerVersion 
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
  
  object CompilerPlugins {
    val kindProjector = compilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3")
    val betterMonadicFor = compilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.0")
    val silencer = compilerPlugin("com.github.ghik" %% "silencer-plugin" % silencerVersion)
  }
}
