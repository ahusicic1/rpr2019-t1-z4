package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a1 = new Artikl("jabuka", 2, "123");
        Artikl a2 = new Artikl("banana", 2, "456");
        Supermarket market = new Supermarket();
        for(int i=0; i<10; i++) market.dodajArtikl(a1);
        market.dodajArtikl(a2);
        int vel_prije = market.getSize();
        assertEquals(a2.getKod(), (market.izbaciArtiklSaKodom("456")).getKod() );
        assertEquals(vel_prije-1, market.getSize());
    }

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("naziv", 5, "abc");
        Supermarket s = new Supermarket();
        assertTrue(s.dodajArtikl(a));
    }
}