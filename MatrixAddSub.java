class Matrix {
    int a, b, c, d;
    static String matrixType = "2x2";

    void calculate(Matrix m) {
        int s1 = a + m.a;
        int s2 = b + m.b;
        int s3 = c + m.c;
        int s4 = d + m.d;

        System.out.println("Addition:");
        System.out.println(s1 + " " + s2);
        System.out.println(s3 + " " + s4);

        int x1 = a - m.a;
        int x2 = b - m.b;
        int x3 = c - m.c;
        int x4 = d - m.d;

        System.out.println("Subtraction:");
        System.out.println(x1 + " " + x2);
        System.out.println(x3 + " " + x4);
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        m1.a = 1; m1.b = 2;
        m1.c = 3; m1.d = 4;

        m2.a = 5; m2.b = 6;
        m2.c = 7; m2.d = 8;

        System.out.println("Matrix Type: " + matrixType);
        m1.calculate(m2);
    }
}

Matrix Type: 2x2
Addition:
6 8
10 12
Subtraction:
-4 -4
-4 -4