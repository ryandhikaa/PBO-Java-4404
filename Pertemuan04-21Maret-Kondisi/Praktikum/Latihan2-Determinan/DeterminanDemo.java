import java.util.Scanner;

public class DeterminanDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String InputAgain = "y";
        while (InputAgain.equalsIgnoreCase("y")) {
            float nilaiA = 0, nilaiB = 0, nilaiC = 0;
            System.out.println("Input Data A : ");
            nilaiA = in.nextFloat();
            System.out.println("");
            System.out.println("Input Data B : ");
            nilaiB = in.nextFloat();
            System.out.println("");
            System.out.println("Input Data C : ");
            nilaiC = in.nextFloat();
            System.out.println("");

            ModelDeterminan data = new ModelDeterminan(nilaiA, nilaiB, nilaiC);
            data.cetakDeterminan();

            System.out.println("Input data lagi [y/n] ?");
            InputAgain = in.next();
            System.out.println("");
        }
    }
}
