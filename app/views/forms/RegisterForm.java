package views.forms;

import models.User;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

public class RegisterForm {
    public String name = "";
    public String email = "";
    public String abn = "";
    public String password = "";
    public String passwordConfirmation = "";

    public RegisterForm() {
        // Required for form instantiation
    }

    public RegisterForm(String name, String email, String abn, String password, String passwordConfirmation) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    // If errors exist return as a list, otherwise return null
    public List<ValidationError> validate() {

        List<ValidationError> errors = new ArrayList<>();

        // Validate name field
        if(name == null || name.length() == 0) {
            errors.add(new ValidationError("name", "No name was given."));
        }

        // Validate email
        if(!(new Constraints.EmailValidator()).isValid(email)) {
            errors.add(new ValidationError("email", "Invalid email address."));
        }

        // Check that email has not been registered already
        if(User.findByEmail(email) != null) {
            errors.add(new ValidationError("email", "Email address is already registered."));
        }

        // Validate password
        if(password.length() < 8) {
            errors.add(new ValidationError("password", "Password must be at least 8 characters long."));
        }

        if(!password.equals(passwordConfirmation)) {
            errors.add(new ValidationError("password", "Passwords do not match."));
        }

        if(errors.size() > 0) {
            return errors;
        }

        return null;
    }

}
