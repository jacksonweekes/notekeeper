
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jackson/workspace/notekeeper/conf/routes
// @DATE:Fri Aug 28 15:42:17 AEST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:24
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
        }
      """
    )
  
    // @LINE:9
    def showUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.showUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:11
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:12
    def editUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
        }
      """
    )
  
    // @LINE:10
    def newUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.newUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseStaticPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticPageController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseNoteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def createNote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NoteController.createNote",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createnote"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseSessionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def newSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SessionController.newSession",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:18
    def deleteSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SessionController.deleteSession",
      """
        function(sessionID) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout" + _qS([(sessionID == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sessionID", sessionID))])})
        }
      """
    )
  
    // @LINE:17
    def createSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SessionController.createSession",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}