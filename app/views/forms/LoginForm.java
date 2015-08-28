package views.forms;

import models.User;

/**
 * Created by jackson on 25/08/15.
 */
public class LoginForm {
    public String email, password;

    public LoginForm() {
        // Required for form instantiation
    }

    public LoginForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String validate() {
        if(User.authenticate(email, password) == null) {
            return "Invalid email/password combination";
        } else {
            return null;
        }
    }
}
