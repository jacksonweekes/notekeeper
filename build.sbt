name := "notekeeper"

version := "1.0"

lazy val `notekeeper` = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( javaJdbc , cache , javaWs , evolutions )

libraryDependencies ++= Seq(
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.mockito" % "mockito-core" % "1.8.5",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41"
)

routesGenerator := InjectedRoutesGenerator

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  