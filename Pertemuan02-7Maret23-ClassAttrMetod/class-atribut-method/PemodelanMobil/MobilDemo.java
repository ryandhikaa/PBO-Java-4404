
public class MobilDemo {
    public static void main(String[] args) {
        // Membuat Object
        ModelMobil mobil1 = new ModelMobil();
        ModelMobil mobil2 = new ModelMobil();

        // Memanggil atribut
        mobil1.warna = "Hitam";
        mobil1.tahun_produksi = 2003;

        mobil2.warna = "Merah";
        mobil2.tahun_produksi = 2004;

        System.out.println("Warna Mobil 1 : " + mobil1.warna);
        System.out.println("Tahun Mobil 1 : " + mobil1.tahun_produksi);
        System.out.println("Warna Mobil 2 : " + mobil2.warna);
        System.out.println("Tahun Mobil 2 : " + mobil2.tahun_produksi);

        mobil1.tambah_gigi();
        mobil1.tambah_gigi();
        mobil1.kurang_gigi();
    }
}
