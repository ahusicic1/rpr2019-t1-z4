package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli = new Artikl[1000];
    int vel=0;

    public Artikl[] getArtikli() {
        return artikli;
    }
    public int getSize(){ return vel; }

    public Artikl izbaciArtiklSaKodom(String kod){
        int i;
        for(i=0; i<vel; i++){
            if(artikli[i].getKod().equals(kod) ){
                Artikl a = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for(int j=i; j<vel-1 ; j++) artikli[j] = artikli[j+1];
                vel--;
                return a;
            }
        }
        return null;
    }

    public boolean dodajArtikl(Artikl a){
        if(vel>999) return false;
        artikli[vel++] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        return true;
    }



}













