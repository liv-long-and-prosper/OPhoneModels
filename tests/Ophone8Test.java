package OPhone.tests;

import OPhone.models.Ophone8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ophone8Test {

    // initialize test Ophone8 obj
    Ophone8 test = new Ophone8();

    @Test
    void getModel() {
        assertEquals("OPhone8", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(474, test.getPrice());
    }

    @Test
    void getScreen() {
        assertEquals(5.5, test.getScreen());
    }

    @Test
    void getVidRes() {
        assertEquals("720p", test.getVidRes());
    }

    @Test
    void testToString() {
        assertEquals("OPhone8: Price: $474, Comm: 4G, Camera: 8MP, Screen Size: 5.5, Video Resolution: 720p", test.toString());
    }
}