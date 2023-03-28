public class ModelDeterminan {
    double a, b, c, D, x1, x2;

    public ModelDeterminan(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void hitungD() {
        D = b * b - (4 * a * c);
    }

    void hitungX1X2() {
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
        } else if (D == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = (-b / (2 * a)) + (Math.sqrt(D) / (2 * a));
            x2 = (-b / (2 * a)) - (Math.sqrt(D) / (2 * a));
        }
    }

    void cetakDeterminan() {
        hitungD();
        hitungX1X2();
        System.out.println("a   : " + a);
        System.out.println("b   : " + b);
        System.out.println("c   : " + c);

        System.out.println("D   : " + D);
        System.out.println("x1  : " + x1);
        System.out.println("x2  : " + x2);
    }
}
