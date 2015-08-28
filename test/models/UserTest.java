package models;

import org.junit.*;
import play.mvc.Http;
import play.test.FakeApplication;
import play.test.Helpers;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Created by jackson on 24/08/15.
 */
public class UserTest {

    public static FakeApplication app;

    @BeforeClass
    public static void setUp() throws Exception {
        app = Helpers.fakeApplication(Helpers.inMemoryDatabase());
        Helpers.start(app);

        User bob = new User("Bob", "bob@example.com", "password");
        bob.save();
    }

    @Test
    public void addUser() throws Exception {
        int count = User.find.findRowCount();
        User jan = new User("Jan", "jan@example.com", "password");
        jan.save();
        assertEquals(count + 1, User.find.findRowCount());
    }

    @Test
    public void retrieveUser() throws Exception {
        User user = User.find.where().eq("email", "bob@example.com").findUnique();
        assertEquals(user.getName(), "Bob");
        assertEquals(user.getEmail(), "bob@example.com");
    }

    @Test
    public void testFindByEmail() {
        User user = User.findByEmail("bob@example.com");
        assertEquals("Bob", user.getName());
        assertEquals("bob@example.com", user.getEmail());
    }

    @Test
    public void createSessionAndRetrieveUser() throws Exception {
        Http.Context.current.set(TestHelper.getMockContext());
        User bob = User.findByEmail("bob@example.com");
        String sessionID = bob.createNewSession();
        User u = User.findUserFromSessionID(sessionID);
        assertEquals("bob@example.com", u.getEmail());
    }

    @Test
    public void testPreventDuplicateEmail() {
        int count = User.find.findRowCount();
        try {
            User bob2 = new User("bob", "bob@example.com", "password");
            bob2.save();
        } catch (Exception e) {
            // do nothing
        }
        assertEquals(count, User.find.findRowCount());
    }

    @Test
    public void testIsPassword() {
        User bob = User.findByEmail("bob@example.com");
        assertTrue(bob.isPassword("password"));
        assertFalse(bob.isPassword("not_password"));
    }

    @Test
    public void testAuthenticate() {
        assertNotNull(User.authenticate("bob@example.com", "password"));
        assertNull(User.authenticate("bob@example.com", "not_password"));
        assertNull(User.authenticate("null@example.com", "password"));
    }

    @Test
    public void testCreateAndRetreiveNotes() {
        User bob = User.findByEmail("bob@example.com");
        bob.createNote("First note");
        bob.createNote("Another note");
        bob.createNote("Third and last");
        // List comes out in reverse order(ie. "First note" should be at index 2)
        List<Note> notes = bob.getNotes();
        assertEquals(3, notes.size());
        assertEquals("First note", notes.get(2).getMessage());
        assertEquals("Another note", notes.get(1).getMessage());
        assertEquals("Third and last", notes.get(0).getMessage());
        assertNotEquals("Note a note", notes.get(1).getMessage());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        Helpers.stop(app);
    }

}