package OPhone.tests;

import OPhone.models.Ophone9Max;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ophone9MaxTest {

    // initialize test OPhone8Max obj
    Ophone9Max test = new Ophone9Max();

    @Test
    void getModel() {
        assertEquals("OPhone9Max", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(758, test.getPrice());
    }

    @Test
    void getScreen() {
        assertEquals(6.5, test.getScreen());
    }
}