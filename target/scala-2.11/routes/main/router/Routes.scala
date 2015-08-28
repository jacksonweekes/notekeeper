
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jackson/workspace/notekeeper/conf/routes
// @DATE:Fri Aug 28 15:42:17 AEST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  StaticPageController_1: controllers.StaticPageController,
  // @LINE:9
  UserController_2: controllers.UserController,
  // @LINE:16
  SessionController_3: controllers.SessionController,
  // @LINE:21
  NoteController_0: controllers.NoteController,
  // @LINE:24
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    StaticPageController_1: controllers.StaticPageController,
    // @LINE:9
    UserController_2: controllers.UserController,
    // @LINE:16
    SessionController_3: controllers.SessionController,
    // @LINE:21
    NoteController_0: controllers.NoteController,
    // @LINE:24
    Assets_4: controllers.Assets
  ) = this(errorHandler, StaticPageController_1, UserController_2, SessionController_3, NoteController_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, StaticPageController_1, UserController_2, SessionController_3, NoteController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.StaticPageController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.UserController.showUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.newUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.createUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edit""", """controllers.UserController.editUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edit""", """controllers.UserController.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.SessionController.newSession()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.SessionController.createSession()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.SessionController.deleteSession(sessionID:String ?= null)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createnote""", """controllers.NoteController.createNote()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_StaticPageController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_StaticPageController_index0_invoker = createInvoker(
    StaticPageController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StaticPageController",
      "index",
      Nil,
      "GET",
      """ Static Pages""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_showUser1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_UserController_showUser1_invoker = createInvoker(
    UserController_2.showUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showUser",
      Nil,
      "GET",
      """ User pages""",
      this.prefix + """profile"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_newUser2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_newUser2_invoker = createInvoker(
    UserController_2.newUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "newUser",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_createUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_createUser3_invoker = createInvoker(
    UserController_2.createUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "createUser",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_editUser4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edit")))
  )
  private[this] lazy val controllers_UserController_editUser4_invoker = createInvoker(
    UserController_2.editUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editUser",
      Nil,
      "GET",
      """""",
      this.prefix + """edit"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_updateUser5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edit")))
  )
  private[this] lazy val controllers_UserController_updateUser5_invoker = createInvoker(
    UserController_2.updateUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUser",
      Nil,
      "POST",
      """""",
      this.prefix + """edit"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SessionController_newSession6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_SessionController_newSession6_invoker = createInvoker(
    SessionController_3.newSession(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionController",
      "newSession",
      Nil,
      "GET",
      """ Session pages""",
      this.prefix + """login"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_SessionController_createSession7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_SessionController_createSession7_invoker = createInvoker(
    SessionController_3.createSession(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionController",
      "createSession",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SessionController_deleteSession8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_SessionController_deleteSession8_invoker = createInvoker(
    SessionController_3.deleteSession(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionController",
      "deleteSession",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_NoteController_createNote9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createnote")))
  )
  private[this] lazy val controllers_NoteController_createNote9_invoker = createInvoker(
    NoteController_0.createNote(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteController",
      "createNote",
      Nil,
      "POST",
      """ Note pages""",
      this.prefix + """createnote"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_StaticPageController_index0_route(params) =>
      call { 
        controllers_StaticPageController_index0_invoker.call(StaticPageController_1.index())
      }
  
    // @LINE:9
    case controllers_UserController_showUser1_route(params) =>
      call { 
        controllers_UserController_showUser1_invoker.call(UserController_2.showUser())
      }
  
    // @LINE:10
    case controllers_UserController_newUser2_route(params) =>
      call { 
        controllers_UserController_newUser2_invoker.call(UserController_2.newUser())
      }
  
    // @LINE:11
    case controllers_UserController_createUser3_route(params) =>
      call { 
        controllers_UserController_createUser3_invoker.call(UserController_2.createUser())
      }
  
    // @LINE:12
    case controllers_UserController_editUser4_route(params) =>
      call { 
        controllers_UserController_editUser4_invoker.call(UserController_2.editUser())
      }
  
    // @LINE:13
    case controllers_UserController_updateUser5_route(params) =>
      call { 
        controllers_UserController_updateUser5_invoker.call(UserController_2.updateUser())
      }
  
    // @LINE:16
    case controllers_SessionController_newSession6_route(params) =>
      call { 
        controllers_SessionController_newSession6_invoker.call(SessionController_3.newSession())
      }
  
    // @LINE:17
    case controllers_SessionController_createSession7_route(params) =>
      call { 
        controllers_SessionController_createSession7_invoker.call(SessionController_3.createSession())
      }
  
    // @LINE:18
    case controllers_SessionController_deleteSession8_route(params) =>
      call(params.fromQuery[String]("sessionID", Some(null))) { (sessionID) =>
        controllers_SessionController_deleteSession8_invoker.call(SessionController_3.deleteSession(sessionID))
      }
  
    // @LINE:21
    case controllers_NoteController_createNote9_route(params) =>
      call { 
        controllers_NoteController_createNote9_invoker.call(NoteController_0.createNote())
      }
  
    // @LINE:24
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_4.versioned(path, file))
      }
  }
}