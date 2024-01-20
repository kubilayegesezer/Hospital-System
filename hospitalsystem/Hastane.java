package ders9_soru1;

import java.util.ArrayList;

public class Hastane {

    private String hastaneAdi;
    private ArrayList<Personel> personeller = new ArrayList<>();

    public Hastane(String hastaneAdi) {
        this.hastaneAdi = hastaneAdi;
    }

    public void personelEkle(Personel eklenen) {
        personeller.add(eklenen);
        System.out.println("Personel Eklendi: " + eklenen.getUnvan()
                + " " + eklenen.getAd() + " " + eklenen.getSoyad());
    }

    public void personelSil(Personel silinen) {
        personeller.remove(silinen);
        System.out.println("Personel Silindi: " + silinen.getUnvan()
                + " " + silinen.getAd() + " " + silinen.getSoyad());
    }

    public void personelListele() {
        System.out.println("::: " + this.hastaneAdi + " Hastanesi, Personel Listesi :::");
        for (Personel personel : personeller) {
            System.out.println(personel.getUnvan() + " "
                    + personel.getAd() + " " + personel.getSoyad());
        }
        System.out.println("---------------");
    }
}
