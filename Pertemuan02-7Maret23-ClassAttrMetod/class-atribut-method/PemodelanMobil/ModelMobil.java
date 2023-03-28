public class ModelMobil {
    String warna = "";
    int tahun_produksi = 0;
    int gigi = 0;
    boolean kondisi_mobil = false;

    void tambah_gigi() {
        gigi++;
        System.out.println("Gigi Sekarang : " + gigi);
    }

    void kurang_gigi() {
        gigi--;
        System.out.println("Gigi Sekarang : " + gigi);
    }

    void hidupkan_mobil() {
        kondisi_mobil = true;
        if (kondisi_mobil) {
            System.out.println("Mobil dalam posisi menyala");
        } else {
            System.out.println("Mobil dalam posisi mati");
        }
    }

    void matikan_mobil() {
        kondisi_mobil = false;
        if (kondisi_mobil) {
            System.out.println("Mobil dalam posisi menyala");
        } else {
            System.out.println("Mobil dalam posisi mati");
        }
    }
}
