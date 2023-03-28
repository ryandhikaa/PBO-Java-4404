import java.util.Scanner;

public class KalkulatorLuasKelilingBangun {
    public static void main(String[] args) {
        Repeat();
    }

    public static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static int kelPersegi(int sisi) {
        return 4 * sisi;
    }

    public static int luasSegitiga(int alas, int tinggi) {
        return alas * tinggi / 2;
    }

    public static int kelSegitiga(int sisi) {
        return 3 * sisi;
    }

    public static float luasLingkaran(int jari) {
        return 3.14f * (jari * jari);
    }

    public static float kelLingkaran(int jari) {
        return 2 * 3.14f * jari;
    }

    public static int luasPermukaanKubus(int sisi) {
        return 6 * (sisi * sisi);
    }

    public static int volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    public static void Repeat() {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("********    MENU    *********");
        System.out.println("*****************************");
        System.out.println("1. Luas dan Keliling Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Keliling Segitiga");
        System.out.println("4. Luas dan Keliling Lingkaran");
        System.out.println("5. Volume dan Luas Permukaan Kubus");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = isScanner.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Luas dan Keliling Persegi");
                System.out.println("Masukkan sisi : ");
                int sisi = isScanner.nextInt();
                System.out.println("Luas Persegi = " + luasPersegi(sisi));
                System.out.println("Keliling Persegi = " + kelPersegi(sisi));
                System.out.println("============================");
                break;
            case 2:
                System.out.println("Luas Segitiga");
                System.out.println("Masukkan alas : ");
                int alas = isScanner.nextInt();
                System.out.println("Masukkan tinggi : ");
                int tinggi = isScanner.nextInt();
                System.out.println("Luas Segitiga = " + luasSegitiga(alas, tinggi));
                System.out.println("============================");
                break;
            case 3:
                System.out.println("Keliling Segitiga");
                System.out.println("Masukkan sisi : ");
                int sisiSegitiga = isScanner.nextInt();
                System.out.println("Keliling Segitiga = " + kelSegitiga(sisiSegitiga));
                System.out.println("============================");
                break;
            case 4:
                System.out.println("Luas dan Keliling Lingkaran");
                System.out.println("Masukkan jari - jari : ");
                int jariLingkaran = isScanner.nextInt();
                System.out.println("Luas Lingkaran = " + luasLingkaran(jariLingkaran));
                System.out.println("Keliling Lingkaran = " + kelLingkaran(jariLingkaran));
                System.out.println("============================");
                break;
            case 5:
                System.out.println("Volume dan Luas Permukaan Kubus");
                System.out.println("Masukkan sisi : ");
                int sisiKubus = isScanner.nextInt();
                System.out.println("Volume Kubus = " + volumeKubus(sisiKubus));
                System.out.println("Luas Permukaan Kubus = " + luasPermukaanKubus(sisiKubus));
                System.out.println("============================");
                break;
        }
        System.out.println("Apakah ingin lanjut?");
        System.out.println("Ya = Ya/Tidak = random");
        String pilih = isScanner.next();
        if (pilih.equals("Ya")) {
            Repeat();
        } else {
            System.out.println("Terima kasih");
        }
    }

}
