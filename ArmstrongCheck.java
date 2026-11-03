class Armstrong {
    static int totalChecks = 0;

    void check(int n) {
        int original = n, sum = 0;
        int temp = n;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += (int)Math.pow(d, digits);
            temp /= 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");

        System.out.println("Checks: " + totalChecks);
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.check(153);
    }
}


Armstrong Number
Checks: 1