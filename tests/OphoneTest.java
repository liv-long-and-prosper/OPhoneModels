package OPhone.tests;

import OPhone.models.Ophone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OphoneTest {

    // initialize test Ophone obj
    Ophone test = new Ophone();

    @Test
    void getModel() {
        assertEquals("OPhone", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(790, test.getPrice());
    }

    @Test
    void getComm() {
        assertEquals("4G", test.getComm());
    }

    @Test
    void getCam() {
        assertEquals("8MP",test.getCam());
    }

    @Test
    void testToString() {
        assertEquals("OPhone: Price: $790, Comm: 4G, Camera: 8MP", test.toString());
    }
}