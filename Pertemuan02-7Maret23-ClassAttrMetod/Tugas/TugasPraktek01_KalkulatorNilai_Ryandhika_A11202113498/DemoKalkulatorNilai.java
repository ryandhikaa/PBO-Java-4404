package Pertemuan2;

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

        // Default Constructor
        ModelNilai mhs = new ModelNilai();
        mhs.hitungNilai();
        mhs.cetakNilai();

        // Overloaded Constructor
        ModelNilai mhs1 = new ModelNilai("Ryandhika Bintang A.", "A11.2021.13498", 80, 80, 85);
        mhs1.hitungNilai();
        mhs1.cetakNilai();

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

            mhs2.hitungNilai();
            mhs2.cetakNilai();

            System.out.print("Lakukan Input Ulang Nilai? [Y/N] : ");
            Scanner inputUlang = new Scanner(System.in);
            reload = inputUlang.nextLine();
        } while (reload.toLowerCase().equals("y") || reload.toLowerCase().equals("yes"));

    }
}
