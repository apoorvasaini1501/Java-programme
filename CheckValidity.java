class Triangle {
    int a, b, c;
    static String type = "Triangle";

    void check() {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                type = "Equilateral";
            else if (a == b || b == c || a == c)
                type = "Isosceles";
            else
                type = "Scalene";

            System.out.println("Valid Triangle");
            System.out.println("Type: " + type);
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 5;
        t.b = 5;
        t.c = 5;
        t.check();
    }
}

Valid Triangle
Type: Equilateral