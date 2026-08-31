import java.util.Scanner;

class MixedProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check power of 4
        int temp = n;
        boolean powerOf4 = true;

        if (temp <= 0) {
            powerOf4 = false;
        }

        while (temp > 1) {
            if ((temp & 1) != 0) {
                powerOf4 = false;
                break;
            }
            temp = temp >> 2;
        }

        if (powerOf4) {
            System.out.println(n + " is a power of 4.");
        } else {
            System.out.println(n + " is not a power of 4.");
        }

        // Toggle 3rd bit
        int toggled = n ^ (1 << 2);

        System.out.println("After toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 12; i++) {
            int result = n * i;

            if (result % 6 == 0) {
                continue;
            }

            if (result % 48 == 0) {
                break;
            }

            System.out.println(n + " x " + i + " = " + result);
        }
    }
}