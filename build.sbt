import Dependencies._

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / libraryDependencies ++= CompilerPlugins.all

lazy val root = (project in file("."))
  .settings(
    name := "scala-barebones",
    libraryDependencies ++= Seq(
      catsCore,
      munit
    )
  )
