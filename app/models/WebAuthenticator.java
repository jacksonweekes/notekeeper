package models;

import controllers.routes;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by jackson on 24/08/15.
 */
public class WebAuthenticator extends Security.Authenticator {

    @Override
    public String getUsername(Http.Context context) {
        User u = User.findUserFromSessionID(context.session().get(Session.SESSION_VAR));
        if(u != null) {
            return u.getEmail();
        } else return null;
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return redirect(routes.SessionController.newSession());
    }

    public static User getUser(Http.Context context) {
        // TODO: Return user
        return null;
    }
}
