package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void testCijenaArtikla(){
        Artikl artikl = new Artikl("mlijeko", 2, "123");
        assertEquals(2, artikl.getCijena());
    }

}