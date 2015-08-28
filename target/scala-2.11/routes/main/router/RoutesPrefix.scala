
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jackson/workspace/notekeeper/conf/routes
// @DATE:Fri Aug 28 15:42:17 AEST 2015


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
