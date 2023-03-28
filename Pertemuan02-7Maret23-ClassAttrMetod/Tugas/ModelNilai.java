public class ModelNilai {
    String nim;
    String nama;
    float nilaiTUGAS;
    float nilaiUTS;
    float nilaiUAS;
    float persenTugas = 0.30f;
    float persenUTS = 0.35f;
    float persenUAS = 0.35f;
    float pNilaiTUGAS;
    float pNilaiUTS;
    float pNilaiUAS;
    float nilaiAkhir;
    String nilaiAkhirhuruf;

    void hitungNilai() {
        pNilaiTUGAS = persenTugas * this.nilaiTUGAS;
        pNilaiUTS = persenUTS * this.nilaiUTS;
        pNilaiUAS = persenUAS * this.nilaiUAS;
    }

    void cetakNilai() {
        System.out.println("*****************************************");
        System.out.println("******    HASIL KALKULASI NILAI    ******");
        System.out.println("*****************************************");
        System.out.println("NIM         : " + this.nim);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Nilai TUGAS : " + this.nilaiTUGAS + "     30%     : " + pNilaiTUGAS);
        System.out.println("Nilai UTS   : " + this.nilaiUTS + "     35%     : " + pNilaiUTS);
        System.out.println("Nilai UAS   : " + this.nilaiUAS + "     35%     : " + pNilaiUAS);
        nilaiAkhir = pNilaiTUGAS + pNilaiUTS + pNilaiUAS;
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        if (nilaiAkhir <= 49) {
            nilaiAkhirhuruf = "E";
        } else if (nilaiAkhir <= 59) {
            nilaiAkhirhuruf = "D";
        } else if (nilaiAkhir <= 69) {
            nilaiAkhirhuruf = "C";
        } else if (nilaiAkhir <= 84) {
            nilaiAkhirhuruf = "B";
        } else {
            nilaiAkhirhuruf = "A";
        }
        System.out.println("Nilai Huruf : " + nilaiAkhirhuruf);
    }
}
