class Palindrome {
    static int countChecks = 0;

    void check(int n) {
        int original = n, rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        countChecks++;

        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        System.out.println("Checks: " + countChecks);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.check(121);
    }
}

Palindrome
Checks: 1