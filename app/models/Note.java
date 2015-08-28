package models;

import com.avaje.ebean.Model;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by jackson on 27/08/15.
 */
@Entity
public class Note extends Model implements Comparable<Note> {

    @Id
    String id;
    @Column(columnDefinition = "TEXT")
    String message;
    DateTime createTime;

    @ManyToOne
    User user;

    public static Finder<String, Note> find = new Finder<>(Note.class);

    public Note(User user, String message) {
        id = java.util.UUID.randomUUID().toString();
        this.message = message;
        this.user = user;
        this.createTime = DateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    @Override
    public int compareTo(Note n) {
        if(createTime.getMillis() < n.getCreateTime().getMillis()) {
            return 1;
        } else if(createTime.getMillis() == n.getCreateTime().getMillis()) {
            return 0;
        } else {
            return -1;
        }
    }
}
