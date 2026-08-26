import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3-digit number:");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int original = num;

            int digit1 = num / 100;
            int digit2 = (num / 10) % 10;
            int digit3 = num % 10;

            int sum = (digit1 * digit1 * digit1)
                    + (digit2 * digit2 * digit2)
                    + (digit3 * digit3 * digit3);

            if (sum == original) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }

        sc.close();
    }
}