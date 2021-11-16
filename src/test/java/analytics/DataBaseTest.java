package analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    БазаДаних oldDataBase;
    DataBase newDataBase;

    @BeforeEach
    void setUp() {
        oldDataBase = new БазаДаних();
        newDataBase = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals(oldDataBase.отриматиДаніКористувача(), newDataBase.getUserData());
    }

    @Test
    void getStatData() {
        assertEquals(oldDataBase.отриматиСтатистичніДані(), newDataBase.getStatData());
    }
}