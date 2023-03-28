import java.util.Scanner;

public class PenjualanDemo {
    public static void main(String[] args) {
        String reload = "";

        // Using loop
        do {
            System.out.println("*****************************************");
            System.out.println("********      PEMBELANJAAN      *********");
            System.out.println("*****************************************");
            // // Proses Input di Demo
            // Scanner inputdata = new Scanner(System.in);
            // System.out.println("******** INPUT DATA BELANJA ********");
            // System.out.print("Masukkan Kode Barang : ");
            // String kode = inputdata.nextLine();
            // System.out.print("Masukkan Nama Barang : ");
            // String nama = inputdata.nextLine();
            // System.out.print("Masukkan Harga Barang : ");
            // double harga = inputdata.nextDouble();
            // System.out.print("Masukkan Jumlah Barang : ");
            // int jumlah = inputdata.nextInt();
            // System.out.println("*****************************************");
            // ModelPenjualan penjualan = new ModelPenjualan(kode, nama, harga, jumlah);

            // Proses Input di CLass Model
            ModelPenjualan penjualan = new ModelPenjualan();
            penjualan.setData();

            penjualan.cetakNota();

            System.out.print("Lakukan Input Ulang Nilai? [Y/N] : ");
            Scanner inputUlang = new Scanner(System.in);
            reload = inputUlang.nextLine();
        } while (reload.toLowerCase().equals("y") || reload.toLowerCase().equals("yes"));
    }
}
