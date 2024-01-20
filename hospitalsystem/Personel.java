package ders9_soru1;

public class Personel extends Kisi {

    private String unvan;

    public Personel(String ad, String soyad) {
        super(ad, soyad);
    }


    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

}
