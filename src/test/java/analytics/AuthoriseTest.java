package analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthoriseTest {

    Авторизація oldAuthorise;
    Authorise newAuthorise;
    DataBase dataBase;

    @BeforeEach
    void setUp() {
        oldAuthorise = new Авторизація();
        newAuthorise = new Authorise();
        dataBase = new DataBase();
    }

    @Test
    void authorise() {
        assertEquals(oldAuthorise.авторизуватися(dataBase), newAuthorise.authorise(dataBase));
    }
}