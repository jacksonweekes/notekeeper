
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jackson/workspace/notekeeper/conf/routes
// @DATE:Fri Aug 28 15:42:17 AEST 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStaticPageController StaticPageController = new controllers.ReverseStaticPageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseNoteController NoteController = new controllers.ReverseNoteController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSessionController SessionController = new controllers.ReverseSessionController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStaticPageController StaticPageController = new controllers.javascript.ReverseStaticPageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseNoteController NoteController = new controllers.javascript.ReverseNoteController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSessionController SessionController = new controllers.javascript.ReverseSessionController(RoutesPrefix.byNamePrefix());
  }

}
