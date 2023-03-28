public class SingleArray01 {
    public static void main(String[] args) {
        // Cara 1
        int[] x;
        x = new int[3];
        x[0] = 20;
        x[1] = 10;
        x[2] = 30;

        System.out.println("Nilai x[0] = " + x[0]);
        System.out.println("Nilai x[1] = " + x[1]);
        System.out.println("Nilai x[2] = " + x[2]);

        // Cara 2
        int[] y = new int[3];
        y[0] = 20;
        y[1] = 10;
        y[2] = 30;
        System.out.println("Nilai y[0] = " + y[0]);
        System.out.println("Nilai y[1] = " + y[1]);
        System.out.println("Nilai y[2] = " + y[2]);

        // Cara 3 tidak menggunakan new array
        int[] z = { 20, 10, 30 };
        System.out.println("Nilai z[0] = " + z[0]);
        System.out.println("Nilai z[1] = " + z[1]);
        System.out.println("Nilai z[2] = " + z[2]);

    }
}
