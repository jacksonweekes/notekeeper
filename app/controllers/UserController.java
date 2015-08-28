package controllers;

import models.Session;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.forms.RegisterForm;

import java.util.List;

/* Controller class for all functionality related to users

    newUser - renders register page
    createUser - creates new user and adds to database

    showUser - renders users homepage

    editUser - renders edit user page
    updateUser - updates user information
 */
public class UserController extends Controller {

    @Security.Authenticated(models.WebAuthenticator.class)
    public Result showUser() {
        User u = User.findUserFromSessionID(session().get(Session.SESSION_VAR));
        //List<Session> sessionList = Session.find.where().eq("user", u).findList();
        return ok(views.html.users.user.render(u));
    }

    public Result newUser() {
        Form<RegisterForm> registerForm = Form.form(RegisterForm.class).fill(new RegisterForm());
        return ok(views.html.users.register.render(registerForm));
    }

    public Result createUser() {
        Form<RegisterForm> registerForm = Form.form(RegisterForm.class).bindFromRequest();

        if(registerForm.hasErrors()) {
            flash("error", "Form contains errors.");
            // TODO: Remove password from form being returned
            return badRequest(views.html.users.register.render(registerForm));
        } else {
            RegisterForm registerData = registerForm.get();
            User user = new User(registerData.name, registerData.email, registerData.password);
            user.save();
            flash("success", "You have successfully registered");
            session(Session.SESSION_VAR, user.createNewSession());
            return redirect(routes.UserController.showUser());
        }
    }

    public Result editUser() {
        return ok("Not implemented yet");
    }

    public Result updateUser() {
        return ok("Not implemented yet");
    }

}
