public class ModelKonversiWaktu {
    int hari, jam, menit, detik, konversi;

    ModelKonversiWaktu() {
    }

    ModelKonversiWaktu(int konversi) {
        this.konversi = konversi;
    }

    void konversi() {
        hari = konversi / 86400;
        jam = (konversi % 86400) / 3600;
        menit = (konversi % 3600) / 60;
        detik = (konversi % 3600) % 60;
    }

    void cetakKonversi() {
        System.out.println("=====================");
        System.out.println("SISTEM KONVERSI WAKTU");
        System.out.println("=====================");
        System.out.println("Detik       : " + konversi);
        konversi();
        System.out.println("Hari        : " + hari);
        System.out.println("Jam         : " + jam);
        System.out.println("Menit       : " + menit);
        System.out.println("Sisa Detik  : " + detik);
    }
}
