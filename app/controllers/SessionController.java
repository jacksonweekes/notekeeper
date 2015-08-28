package controllers;

import models.Session;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.forms.LoginForm;

/**
 * Created by jackson on 25/08/15.
 */
public class SessionController extends Controller {

    // Renders the login form
    public Result newSession() {
        Form<LoginForm> loginForm = Form.form(LoginForm.class).fill(new LoginForm());
        return ok(views.html.sessions.login.render(loginForm));
    }

    // Binds data from login form and tries to authenticate information
    // If authentic, new session is created, otherwise the login page is re-rendered
    public Result createSession() {
        Form<LoginForm> loginForm = Form.form(LoginForm.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            flash("error", "Form contains errors.");
            return badRequest(views.html.sessions.login.render(loginForm));
        } else {
            LoginForm loginData = loginForm.get();
            User u = User.authenticate(loginData.email, loginData.password);
            session(Session.SESSION_VAR, u.createNewSession());
            flash("success", "You are now logged in.");
            return redirect(routes.UserController.showUser());
        }
    }

    // Logout. If sessionID is null, deletes the current session.
    public Result deleteSession(String sessionId) {
        if (sessionId == null) {
            sessionId = session().get(Session.SESSION_VAR);
            session().clear();
            Session.find.byId(sessionId).delete();
            flash("success", "You have now been logged out");
            return redirect(routes.StaticPageController.index());
        } else {
            flash("success", "Remote session unauthorized");
            Session.find.byId(sessionId).delete();
            return redirect(routes.UserController.showUser());
        }
    }
}
