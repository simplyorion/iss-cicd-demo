package sg.edu.nus.iss.cicddemo.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DataControllerTest {
    @Autowired
    DataController dataController;

    @Test
    void healthCheck() {
        Assertions.assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
    }

    @Test
    void version() {
        Assertions.assertEquals("The actual version is 1.0.0", dataController.version());

    }

    @Test
    void getRandomNations() {
        Integer nationsLength = dataController.getRandomNations().size();
        Assertions.assertEquals(10, nationsLength);

    }

    @Test
    void getRandomCurrencies() {
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }
}
