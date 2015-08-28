package controllers;

import models.Session;
import models.User;
import models.WebAuthenticator;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.Map;

/**
 * Created by jackson on 27/08/15.
 */
public class NoteController extends Controller {

    @Security.Authenticated(WebAuthenticator.class)
    public Result createNote() {
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        String message = values.get("message")[0];
        User user = User.findUserFromSessionID(session().get(Session.SESSION_VAR));
        user.createNote(message);
        return redirect(routes.UserController.showUser());
    }


}
