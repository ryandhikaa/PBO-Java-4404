
/*
 * PBO - Pak Danny Oka
 * Author : Ryandhika Bintang
 * Nim  : A11.2021.13498
 * A11.4404
 */

import java.util.Scanner;

public class DemoKalkulatorNilai {

    public static void main(String[] args) {
        String reload = "";
        ModelNilai[] daftarNilai = new ModelNilai[100];

        int jumlahData = 0;

        // Using loop
        do {
            System.out.println("*****************************************");
            System.out.println("********    KALKULATOR NILAI    *********");
            System.out.println("*****************************************");
            Scanner inputdata = new Scanner(System.in);
            System.out.println("********  INPUT NILAI MAHASISWA  ********");
            System.out.print("Masukkan Nama         : ");
            String Nama = inputdata.nextLine();
            System.out.print("Masukkan NIM          : ");
            String NIM = inputdata.nextLine();
            System.out.print("Masukkan Nilai Tugas  : ");
            double nTugas = inputdata.nextDouble();
            System.out.print("Masukkan Nilai UTS    : ");
            double nUTS = inputdata.nextDouble();
            System.out.print("Masukkan Nilai UAS    : ");
            double nUAS = inputdata.nextDouble();
            System.out.println("*****************************************");

            ModelNilai mhs2 = new ModelNilai(Nama, NIM, nTugas, nUTS, nUAS); // Using Overloaded Constructor

            daftarNilai[jumlahData] = mhs2;
            jumlahData++;

            mhs2.hitungNilai();
            mhs2.cetakNilai();

            System.out.print("Lakukan Input Ulang Nilai? [Y/N] : ");
            Scanner inputUlang = new Scanner(System.in);
            reload = inputUlang.nextLine();
        } while (reload.toLowerCase().equals("y") || reload.toLowerCase().equals("yes"));

        cetakDaftarNilai(daftarNilai, jumlahData);

    }

    //
    static void cetakDaftarNilai(ModelNilai[] modelNilai, int jumlahData) {
        System.out.println("================================================================================");
        System.out.println("    DAFTAR NILAI");
        System.out.println("================================================================================");
        System.out.println("No\tNIM\tNAMA\tNilai Akhir\tNilai Huruf\tPredikat");

        for (int i = 0; i < jumlahData; i++) {
            System.out.println((i + 1) + "\t" + modelNilai[i].getNIM() + "\t" + modelNilai[i].getNama()
                    + "\t" + modelNilai[i].getNAkhir() + "\t\t"
                    + modelNilai[i].getNilaiHuruf(modelNilai[i].getNAkhir()) + "\t\t"
                    + modelNilai[i].getPredikat(modelNilai[i].getNilaiHuruf(modelNilai[i].getNAkhir())));

        }
        System.out.println("================================================================================");

    }
}
