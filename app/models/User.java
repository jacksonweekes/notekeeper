package models;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import com.avaje.ebean.*;
import play.data.validation.Constraints;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class User extends Model {

    @Id
    private String id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    @Column(unique = true)
    @Constraints.Email
    private String email;

    @Constraints.MinLength(8)
    private String passwordDigest;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Session> sessions;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Note> notes;

    public static Finder<String, User> find = new Finder<>(User.class);

    //<editor-fold desc="Constructors">
    public User(String name, String email, String abn, String password) {
        id = java.util.UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.passwordDigest = digest(password);
        sessions = new ArrayList<>();
        notes = new ArrayList<>();
    }

    public User(String name, String email, String password) {
        this(name, email, "", password);
    }
    //</editor-fold>

    //<editor-fold desc="Getters">
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    //</editor-fold>

    //<editor-fold desc="Setters">
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //</editor-fold>

    public String createNewSession() {
        Session session = new Session(this, Controller.request().remoteAddress());
        sessions.add(session);
        session.save();
        return session.getId();
    }

    public static User findByEmail(String email) {
        return User.find.where().eq("email", email).findUnique();
    }

    public static User findUserFromSessionID(String sessionID) {
        return User.find.where()
                .eq("sessions.id", sessionID)
                .findUnique();
    }

    private String digest(String input) {
        return BCrypt.hashpw(input, BCrypt.gensalt());
    }

    public boolean isPassword(String input) {
        return BCrypt.checkpw(input, passwordDigest);
    }

    // Returns user if email and password match else returns null
    public static User authenticate(String email, String password) {
        User u = findByEmail(email);
        if(u != null) {
            return u.isPassword(password) ? u : null;
        } else return null;
    }

    public void createNote(String message) {
        Note note = new Note(this, message);
        notes.add(note);
        note.save();
    }

    public List<Note> getNotes() {
        List<Note> userNotes = Note.find.where()
                .eq("user.email", email)
                .findList();
        Collections.sort(userNotes);
        return userNotes;
    }

    public List<Session> getSessions() {
        List<Session> userSessions = Session.find.where()
                .eq("user.email", email)
                .findList();
        return userSessions;
    }

}
