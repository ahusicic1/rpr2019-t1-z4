package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] niz = new Artikl[50];
    int vel=0;

    public boolean dodajArtikl(Artikl a){
        if(vel==49) return false;
        niz[vel++] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        return true;
    }

    public Artikl[] getArtikli() {
        return niz;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
            int i;
            for(i=0; i<vel; i++){
                if(niz[i].getKod().equals(kod) ){
                    Artikl a = new Artikl( niz[i].getNaziv(), niz[i].getCijena(), niz[i].getKod());
                    for(int j=i; j<vel-1 ; j++) niz[j] = niz[j+1];
                    vel--;
                    return a;
                }
            }
            return null;
        }

    public int dajUkupnuCijenuArtikala()   {
        int cijena=0;
        for(int i=0; i<vel; i++) cijena = cijena + niz[i].getCijena();
        return cijena;
    }


}
