package models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import play.test.FakeApplication;
import play.test.Helpers;

import static org.junit.Assert.*;

/**
 * Created by jackson on 27/08/15.
 */
public class NoteTest {

    public static FakeApplication app;

    @BeforeClass
    public static void setUp() throws Exception {
        app = Helpers.fakeApplication(Helpers.inMemoryDatabase());
        Helpers.start(app);

        User bob = new User("Bob", "bob@example.com", "password");
        bob.save();
    }

    @Test
    public void testGetMessage() {
        User bob = User.findByEmail("bob@example.com");
        Note note = new Note(bob, "This is a test.");
        assertEquals("This is a test.", note.getMessage());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        Helpers.stop(app);
    }

}