package ders9_soru1;

public class Hemsire extends Personel {

    private int vardiyaZamani;

    public Hemsire(String ad, String soyad) {
        super(ad, soyad);
    }

    public int getVardiyaZamani() {
        return vardiyaZamani;
    }

    public void setVardiyaZamani(int vardiyaZamani) {
        this.vardiyaZamani = vardiyaZamani;
    }

}
