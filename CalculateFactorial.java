class Factorial {
    static int totalCalls = 0;

    void calculate(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        totalCalls++;
        System.out.println("Factorial: " + fact);
        System.out.println("Total Calls: " + totalCalls);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.calculate(5);
    }
}

Factorial: 120
Total Calls: 1