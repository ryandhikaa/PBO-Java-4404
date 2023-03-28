import java.util.Scanner;

public class KonversiWaktuDemo {
    public static void main(String[] args) {
        String pilihan;
        ModelKonversiWaktu newWaktu = new ModelKonversiWaktu();

        do {
            Scanner input = new Scanner(System.in);
            Scanner ulang = new Scanner(System.in);
            System.out.print("Berapa detik yang ingin anda konversikan : ");
            newWaktu.konversi = input.nextInt();
            newWaktu.cetakKonversi();
            System.out.println("Apakah masih ingin input data[Y/N]: ");
            pilihan = ulang.nextLine();
        } while (pilihan.equals("Y"));
    }
}
