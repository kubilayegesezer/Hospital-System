package ders9_soru1;

public class Hasta extends Kisi {

    private int yas;
    private String tedaviDurumu;

    public Hasta(String ad, String soyad) {
        super(ad, soyad);
    }


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTedaviDurumu() {
        return tedaviDurumu;
    }

    public void setTedaviDurumu(String tedaviDurumu) {
        this.tedaviDurumu = tedaviDurumu;
    }

}
