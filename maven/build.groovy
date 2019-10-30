void call(){
  def buildCommand
  if config.buildOps {
    buildCommand = "clean install" + config.buildOps
  } else {
    buildCommand = "clean install"
  }
  println "maven" + buildCommand
}
