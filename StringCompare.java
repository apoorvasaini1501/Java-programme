import java.util.Scanner;

class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int length = Math.min(str1.length(), str2.length());
        boolean found = false;

        for (int i = 0; i < length; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 > ch2) {
                System.out.println(str1 + " comes after " + str2);
                found = true;
                break;
            } else if (ch1 < ch2) {
                System.out.println(str1 + " comes before " + str2);
                found = true;
                break;
            }
        }

        if (!found) {
            if (str1.length() > str2.length()) {
                System.out.println(str1 + " comes after " + str2);
            } else if (str1.length() < str2.length()) {
                System.out.println(str1 + " comes before " + str2);
            } else {
                System.out.println("Both strings are equal.");
            }
        }
    }
}