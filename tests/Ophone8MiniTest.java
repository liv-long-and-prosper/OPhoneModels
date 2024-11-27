package OPhone.tests;

import OPhone.models.Ophone8Mini;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ophone8MiniTest {

    // initialize test Ophone8Mini obj
    Ophone8Mini test = new Ophone8Mini();

    @Test
    void getModel() {
        assertEquals("OPhone8Mini", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(521, test.getPrice());
    }

    @Test
    void getScreen() {
        assertEquals(4.6, test.getScreen());
    }
}