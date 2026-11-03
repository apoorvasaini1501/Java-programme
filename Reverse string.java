class StringReverse {
    static int totalReversals = 0;

    void reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        totalReversals++;
        System.out.println("Reverse: " + rev);
        System.out.println("Total: " + totalReversals);
    }

    public static void main(String[] args) {
        StringReverse s = new StringReverse();
        s.reverse("Java");
    }
}

Reverse: avaJ
Total: 1