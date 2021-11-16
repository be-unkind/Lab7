package users;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {

    FacebookUser facebookUser;
    MyFacebookUser myFacebookUser;

    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("name@mail.com", "USA", new Date());
        myFacebookUser = new MyFacebookUser(facebookUser);
    }

    @Test
    void getCountry() {
        assertEquals(facebookUser.getEmail(), myFacebookUser.getEmail());
    }

    @Test
    void getLastActive() {
        assertEquals("USA", myFacebookUser.getCountry());
    }

    @Test
    void getEmail() {
        assertNotEquals(null, facebookUser.getUserActiveTime());
    }
}