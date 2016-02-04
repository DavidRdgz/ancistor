
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/galois/Desktop/activator-1.3.7-minimal/play-scala-portfolio/conf/routes
// @DATE:Thu Feb 04 10:46:59 PST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
