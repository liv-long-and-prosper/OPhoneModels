package OPhone.tests;

import OPhone.models.OphoneX;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OphoneXTest {

    // initialize test OphoneX obj
    OphoneX test = new OphoneX();

    @Test
    void getModel() {
        assertEquals("OPhoneX", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(869, test.getPrice());
    }

    @Test
    void getComm() {
        assertEquals("5G", test.getComm());
    }

    @Test
    void getCam() {
        assertEquals("12MP", test.getCam());
    }

    @Test
    void getVidRes() {
        assertEquals("1080p", test.getVidRes());
    }

    @Test
    void getScreen() {
        assertEquals(6.7, test.getScreen());
    }

    @Test
    void testToString() {
        assertEquals( "OPhoneX: Price: $869, Comm: 5G, Camera: 12MP, Screen Size: 6.7, Video Resolution: 1080p", test.toString());
    }
}