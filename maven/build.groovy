void call(){
  node('PROD-LIN7') {
    def buildCommand
    if (config.buildOps) {
      buildCommand = "clean install " + config.buildOps
    } else {
      buildCommand = "clean install"
    }
    println "maven " + buildCommand
  }
}
