package OPhone.tests;

import OPhone.models.OphoneXFold;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OphoneXFoldTest {

    // initialize test OphoneXFold obj
    OphoneXFold test = new OphoneXFold();

    @Test
    void getModel() {
        assertEquals("OPhoneXFold", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(999, test.getPrice());
    }

    @Test
    void getScreen() {
        assertEquals(7.5, test.getScreen());
    }

    @Test
    void getExtra() {
        assertEquals("foldable", test.getExtra());
    }

    @Test
    void testToString() {
        assertEquals("OPhoneXFold: Price: $999, Comm: 5G, Camera: 12MP, Screen Size: 7.5, Video Resolution: 1080p, Extra: foldable", test.toString());
    }
}