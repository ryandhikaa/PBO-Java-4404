import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.control.Menu;

public class DemoPenjualans {

    static ArrayList<ModelPenjualan> mListPenjualan;
    static double dTotalBelanja;

    public static void main(String[] args) {
        mListPenjualan = new ArrayList<ModelPenjualan>();
        menu();
    }

    static void menu() {
        Scanner sMenuScanner = new Scanner(System.in);
        System.out.println("+===================     MENU     ===================+");
        System.out.println("+   1. Input Item Belanjaan                          +");
        System.out.println("+   2. Cetak Struk Belanjaan                         +");
        System.out.println("+====================================================+");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = sMenuScanner.nextInt();
        switch (pilihan) {
            case 1:
                inputItemBarang();
                break;

            case 2:
                cetakStruk();
                break;
            default:
                System.out.println("+==================== TERIMAKASIH ===================+");
                break;
        }
    }

    static void inputItemBarang() {
        String reload = "";
        do {
            Scanner sInputScanner = new Scanner(System.in);
            System.out.println("+============     INPUT ITEM BELANJA     ============+");
            System.out.print("Masukkan banyak data = ");
            int iBanyakItem = sInputScanner.nextInt();
            for (int a = 1; a <= iBanyakItem; a++) {
                ModelPenjualan mPenjualan = new ModelPenjualan();
                System.out.println("+===============      Data Ke- " + a + "      ===============+");
                System.out.print("Masukan KODE ITEM = ");
                mPenjualan.setKodeItem(sInputScanner.next());
                System.out.print("Masukan NAMA ITEM = ");
                mPenjualan.setNamaItem(sInputScanner.next());
                System.out.print("Masukan HARGA ITEM = ");
                mPenjualan.setHargaItem(sInputScanner.nextDouble());
                System.out.print("Masukan QTY ITEM = ");
                mPenjualan.setQtyItem(sInputScanner.nextInt());
                mListPenjualan.add(mPenjualan);
            }
        } while (reload.toLowerCase().equals("y") || reload.toLowerCase().equals("yes"));
        menu();
    }

    static void cetakStruk() {
        System.out.println("+==============     KASIR BELANJA     ===============+");
        for (int i = 0; i < mListPenjualan.size(); i++) {
            ModelPenjualan brg = mListPenjualan.get(i);
            System.out.println("+===============      ITEM Ke- " + i + "      ===============+");
            System.out.println(" KODE ITEM           : " + brg.getKodeItem());
            System.out.println(" NAMA ITEM           : " + brg.getNamaItem());
            System.out.println(" HARGA ITEM          : " + brg.getHargaItem());
            System.out.println(" QTY ITEM            : " + brg.getQtyItem());
            System.out.println(" TOTAL HARGA ITEM    : " + brg.getTotalPembelian());
            dTotalBelanja += brg.getTotalPembelian();
        }
        System.out.println("+==============     KASIR BELANJA     ===============+");
        System.out.println("+====================================================+");
        System.out.println(" TOTAL BELANJA SELURUHNYA : " + dTotalBelanja);
        System.out.println("+====================================================+");
        menu();
    }
}
