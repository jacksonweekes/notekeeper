package models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import play.mvc.Http;
import play.test.FakeApplication;
import play.test.Helpers;

import static org.junit.Assert.*;

/**
 * Created by jackson on 27/08/15.
 */
public class SessionTest {

    public static FakeApplication app;

    @BeforeClass
    public static void setUp() throws Exception {
        app = Helpers.fakeApplication(Helpers.inMemoryDatabase());
        Helpers.start(app);

        User bob = new User("Bob", "bob@example.com", "password");
        bob.save();
    }

    @Test
    public void testGetIpAddress() throws Exception {
        User bob = User.findByEmail("bob@example.com");
        Session session = new Session(bob, "104.156.228.162");
        assertEquals("104.156.228.162", session.getIpAddress());
    }

    @Test
    public void testGetLocation() throws Exception {
        User bob = User.findByEmail("bob@example.com");
        Session session = new Session(bob, "139.130.4.5");
        assertEquals("Melbourne", session.getLocation());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        Helpers.stop(app);
    }

}