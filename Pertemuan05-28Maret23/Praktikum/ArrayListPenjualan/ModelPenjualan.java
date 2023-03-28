import javax.lang.model.util.ElementScanner6;

import javafx.print.PrinterAttributes;

public class ModelPenjualan {
    private String kodeItem, namaItem;
    private double hargaItem;
    private int qtyItem;
    private double totalHargaItem;
    private String bonus;

    // Mengisi default value
    ModelPenjualan() {
        kodeItem = "anonymous";
        namaItem = "anonymous";
        hargaItem = 0.0f;
        qtyItem = 0;
        totalHargaItem = 0.0;
        bonus = "anonymous";
    }

    ModelPenjualan(String kodeItem, String namaItem, double hargaItem, int qtyItem) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.qtyItem = qtyItem;
        this.hargaItem = hargaItem;
    }

    // Getters and setters
    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setHargaItem(double hargaItem) {
        this.hargaItem = hargaItem;
    }

    public double getHargaItem() {
        return hargaItem;
    }

    public void setQtyItem(int qtyItem) {
        this.qtyItem = qtyItem;
    }

    public double getQtyItem() {
        return qtyItem;
    }

    public void setTotalHargaItem(double totalHargaItem) {
        this.totalHargaItem = totalHargaItem;
    }

    public double getTotalHargaItem() {
        return totalHargaItem;
    }

    // Fungsi kalkulasi total pembelian (harga per item dikali banyak item)
    double getTotalPembelian() {
        totalHargaItem = hargaItem * qtyItem;
        return totalHargaItem;
    }

    // Fungsi bonus dengan kondisi tertentu
    String getBonus(double totalPembelian, int qtyItem) {
        if (totalPembelian >= 500000 && qtyItem > 5)
            bonus = "Setrika";
        else if (totalPembelian >= 100000 && qtyItem > 3)
            bonus = "Payung";
        else if (totalPembelian >= 50000 && qtyItem > 2)
            bonus = "Ballpoint";
        else
            bonus = "Mohon maaf anda tidak mendapat bonus";
        return bonus;
    }

    void cetakNota() {
        System.out.println("***********************************");
        System.out.println("***********  CETAK NOTA ***********");
        System.out.println("***********************************");
        System.out.println("kodeItem Barang     : " + kodeItem);
        System.out.println("namaItem Barang     : " + namaItem);
        System.out.println("Harga Barang    : " + hargaItem);
        System.out.println("qtyItem Barang   : " + qtyItem);
        System.out.println("Total Harga     : " + getTotalPembelian());
        System.out.println("Bonus           : " + getBonus(hargaItem, qtyItem));
        System.out.println("***********************************");
    }

}
