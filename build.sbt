name := "property content"

version := "0.1"

scalaVersion := "2.11.2"

lazy val pca,pcs,acceptance,loadtest = project

lazy val pca_lodging = project.dependsOn(pca)
