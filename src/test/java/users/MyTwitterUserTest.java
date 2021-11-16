package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    TwitterUser twitterUser;
    MyTwitterUser myTwitterUser;

    @BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("twitter@mail.com", "UK", new Date());
        myTwitterUser = new MyTwitterUser(twitterUser);
    }

    @Test
    void getEmail() {
        assertEquals("twitter@mail.com", myTwitterUser.getEmail());
    }

    @Test
    void getCountry() {
        assertEquals(twitterUser.getCountry(), myTwitterUser.getCountry());
    }

    @Test
    void getLastActive() {
        assertNotEquals(null, myTwitterUser.getLastActive());
    }
}