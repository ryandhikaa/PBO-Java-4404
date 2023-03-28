import javax.lang.model.element.Element;

/*
 * PBO - Pak Danny Oka
 * Author : Ryandhika Bintang
 * Nim  : A11.2021.13498
 * A11.4404
 */

public class ModelNilai {
    private String Nama;
    private String NIM;
    private double nTugas, nUTS, nUAS, nAkhir;
    private double pNilaiTugas, pNilaiUTS, pNilaiUAS;
    private char nHuruf;
    private String predikat;

    ModelNilai() {
        NIM = "anonymous";
        Nama = "anonymous";
        nTugas = 0.0;
        nUTS = 0.0;
        nUAS = 0.0;
    }

    ModelNilai(String Nama, String NIM, double nTugas, double nUTS, double nUAS) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.nTugas = nTugas;
        this.nUTS = nUTS;
        this.nUAS = nUAS;
    }

    void hitungNilai() {
        pNilaiTugas = 0.2;
        pNilaiUTS = 0.35;
        pNilaiUAS = 0.45;
        nAkhir = (nTugas * pNilaiTugas) + (nUTS * pNilaiUTS) + (nUAS * pNilaiUAS);
    }

    void cetakNilai() {
        System.out.println("==================================");
        System.out.println("Nama        : " + Nama);
        System.out.println("NIM         : " + NIM);
        System.out.println("Nilai Tugas : " + nTugas);
        System.out.println("Nilai UTS   : " + nUTS);
        System.out.println("Nilai UAS   : " + nUAS);
        System.out.println("Nilai Akhir : " + nAkhir);
        System.out.println("Nilai Huruf : " + getNilaiHuruf(nAkhir));
        System.out.println("Predikat    : " + getPredikat(getNilaiHuruf(nAkhir)));
        System.out.println("==================================");
    }

    char getNilaiHuruf(Double nilai) {
        if (nilai >= 85)
            nHuruf = 'A';
        else if (nilai >= 70 && nilai < 85)
            nHuruf = 'B';
        else if (nilai >= 60 && nilai < 70)
            nHuruf = 'C';
        else if (nilai >= 40 && nilai < 60)
            nHuruf = 'D';
        else
            nHuruf = 'E';
        return nHuruf;
    }

    String getPredikat(char huruf) {
        switch (huruf) {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
                break;
        }
        return predikat;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }
}
