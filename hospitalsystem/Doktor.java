package ders9_soru1;

import java.util.ArrayList;

public class Doktor extends Personel {

    private ArrayList<Hasta> hastalar = new ArrayList<>();

    public Doktor(String ad, String soyad) {
        super(ad, soyad);
    }

    public void hastaEkle(Hasta eklenen) {
        hastalar.add(eklenen);
        System.out.println("Hasta Eklendi: " + this.getUnvan() + " "
                + super.getAd() + " " + super.getSoyad() + " -> " + eklenen.getAd() + " " + eklenen.getSoyad());
    }

    public void hastaSil(Hasta silinen) {
        hastalar.remove(silinen);
        System.out.println("Hasta Silindi: " + this.getUnvan() + " "
                + super.getAd() + " " + super.getSoyad() + "  -> " + silinen.getAd() + " " + silinen.getSoyad());
    }

    public void hastaListele() {
        System.out.println("::: " + this.getUnvan() + " " + super.getAd() + " Hasta Listesi :::");
        for (Hasta hasta : hastalar) {
            // burada sadece ad değil, 
            // diğer bilgiler de konsola bastırılabilir.
            System.out.println("Hasta: " + hasta.getAd() + " " + hasta.getSoyad());
        }
        System.out.println("---------------");
    }
}
