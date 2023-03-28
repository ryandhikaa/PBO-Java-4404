import java.util.Scanner;

public class KalkulatorNilai {
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("********    KALKULATOR NILAI    *********");
        System.out.println("*****************************************");

        ModelNilai mModelNilai = new ModelNilai();

        Scanner isScanner = new Scanner(System.in);
        System.out.print("Masukkan NIM            : ");
        mModelNilai.nim = isScanner.next();
        System.out.print("Masukkan Nama           : ");
        mModelNilai.nama = isScanner.next();
        System.out.print("Masukkan Nilai TUGAS    : ");
        mModelNilai.nilaiTUGAS = isScanner.nextFloat();
        System.out.print("Masukkan Nilai UTS      : ");
        mModelNilai.nilaiUTS = isScanner.nextFloat();
        System.out.print("Masukkan Nilai UAS      : ");
        mModelNilai.nilaiUAS = isScanner.nextFloat();

        mModelNilai.hitungNilai();
        mModelNilai.cetakNilai();
    }
}
