package ders9_soru1;

public class Test {

    public static void main(String[] args) {


        Doktor doktor = new Doktor("Osman", "Müftüoğlu");
        doktor.setUnvan("Dr.");

        Hemsire hemsire = new Hemsire("Aylin", "Akça");
        hemsire.setUnvan("Hem.");
        hemsire.setVardiyaZamani(23);

        Hastane hastane = new Hastane("Acıbadem");
        hastane.personelEkle(doktor);
        hastane.personelEkle(hemsire);
        hastane.personelListele();

        Hasta hasta1 = new Hasta("Ali", "Öztürk");
        Hasta hasta2 = new Hasta("Mehmet", "Yalın");
        Hasta hasta3 = new Hasta("Serap", "Demir");

        doktor.hastaEkle(hasta1);
        doktor.hastaEkle(hasta2);
        doktor.hastaEkle(hasta3);
        doktor.hastaSil(hasta3);
        doktor.hastaListele();

    }
}
