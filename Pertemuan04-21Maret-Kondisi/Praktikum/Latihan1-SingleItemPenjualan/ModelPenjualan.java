import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import javafx.print.PrinterAttributes;

public class ModelPenjualan {
    private String kode, nama;
    private double hargaItem;
    private int jumlah;
    private double totalHarga;
    private String bonus;

    Scanner inputdata = new Scanner(System.in);

    ModelPenjualan() {
        kode = "anonymous";
        nama = "anonymous";
        hargaItem = 0.0f;
        jumlah = 0;
        totalHarga = 0.0;
        bonus = "anonymous";
    }

    ModelPenjualan(String kode, String nama, double hargaItem, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.hargaItem = hargaItem;
    }

    void setData() {
        System.out.println("********    INPUT DATA BELANJA   ********");
        System.out.print("Masukkan Kode Barang      : ");
        kode = inputdata.nextLine();
        System.out.print("Masukkan Nama Barang      : ");
        nama = inputdata.nextLine();
        System.out.print("Masukkan Harga Barang     : ");
        hargaItem = inputdata.nextDouble();
        System.out.print("Masukkan Jumlah Barang    : ");
        jumlah = inputdata.nextInt();
    }

    double getTotalPembelian() {
        totalHarga = hargaItem * jumlah;
        return totalHarga;
    }

    String getBonus(double totalPembelian, int jumlah) {
        if (totalPembelian >= 500000 && jumlah > 5)
            bonus = "Setrika";
        else if (totalPembelian >= 100000 && jumlah > 3)
            bonus = "Payung";
        else if (totalPembelian >= 50000 || jumlah > 2)
            bonus = "Ballpoint";
        else
            bonus = "Mohon maaf anda tidak mendapat bonus";
        return bonus;
    }

    void cetakNota() {
        System.out.println("***********************************");
        System.out.println("***********  CETAK NOTA ***********");
        System.out.println("***********************************");
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + nama);
        System.out.println("Harga Barang    : " + hargaItem);
        System.out.println("Jumlah Barang   : " + jumlah);
        System.out.println("Total Harga     : " + getTotalPembelian());
        System.out.println("Bonus           : " + getBonus(hargaItem, jumlah));
        System.out.println("***********************************");
    }

}
