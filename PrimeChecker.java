class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int n) {
        boolean prime = n > 1;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        totalPrimeChecks++;

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");

        System.out.println("Checks: " + totalPrimeChecks);
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();
        p.check(7);
    }
}

Prime Number
Checks: 1