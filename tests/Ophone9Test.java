package OPhone.tests;

import OPhone.models.Ophone9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ophone9Test {

    // initialize test Ophone9 obj
    Ophone9 test = new Ophone9();

    @Test
    void getModel() {
        assertEquals("OPhone9", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(632, test.getPrice());
    }

    @Test
    void getComm() {
        assertEquals("5G", test.getComm());
    }

    @Test
    void getCam() {
        assertEquals("10MP", test.getCam());
    }

    @Test
    void getScreen() {
        assertEquals(5.6, test.getScreen());
    }

    @Test
    void getVidRes() {
        assertEquals("1080p", test.getVidRes());
    }

    @Test
    void testToString() {
        assertEquals("OPhone9: Price: $632, Comm: 5G, Camera: 10MP, Screen Size: 5.6, Video Resolution: 1080p", test.toString());
    }
}