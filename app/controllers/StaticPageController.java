package controllers;

import models.Session;
import models.User;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class StaticPageController extends Controller {

    public Result index() {
        if(User.findUserFromSessionID(session().get(Session.SESSION_VAR)) != null) {
            return redirect(routes.UserController.showUser());
        }
        return ok(index.render("This is a message"));
    }

}
