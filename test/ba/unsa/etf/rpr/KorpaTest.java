package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("mlijeko", 2, "123");
        Korpa korpa = new Korpa();
        assertTrue(korpa.dodajArtikl(a));
    }

    @Test
    void dodajArtiklPrekoracenje() {
        Artikl a = new Artikl("mlijeko", 2, "123");
        Korpa korpa = new Korpa();

        for(int i=0; i<=49; i++) korpa.dodajArtikl(a);

        assertFalse(korpa.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a = new Artikl("mlijeko", 2, "123");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(a);
        assertEquals(a.getKod(), (korpa.izbaciArtiklSaKodom("123")).getKod());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        int cijenaJednog = 5;
        Artikl a = new Artikl("neki artikal", 5, "345");
        Korpa k = new Korpa();
        for(int i=0; i<50; i++){ k.dodajArtikl(a); }
        assertEquals(cijenaJednog*50 , k.dajUkupnuCijenuArtikala());
    }
}