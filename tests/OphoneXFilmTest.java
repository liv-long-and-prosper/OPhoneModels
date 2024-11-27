package OPhone.tests;

import OPhone.models.OphoneXFilm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OphoneXFilmTest {

    // initialize test OphoneXFilm obj
    OphoneXFilm test = new OphoneXFilm();

    @Test
    void getModel() {
        assertEquals("OPhoneXFilm", test.getModel());
    }

    @Test
    void getPrice() {
        assertEquals(1086, test.getPrice());
    }

    @Test
    void getScreen() {
        assertEquals(7.5, test.getScreen());
    }

    @Test
    void getVidRes() {
        assertEquals("4k", test.getVidRes());
    }

    @Test
    void getExtra() {
        assertEquals("slow motion", test.getExtra());
    }

    @Test
    void testToString() {
        assertEquals("OPhoneXFilm: Price: $1086, Comm: 5G, Camera: 12MP, Screen Size: 7.5, Video Resolution: 4k, Extra: slow motion", test.toString());
    }
}