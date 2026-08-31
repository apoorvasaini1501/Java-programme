import java.util.Scanner;

class ShiftOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int multiply = n << 2;
        int divide = n >> 2;

        System.out.println("Number multiplied by 4 = " + multiply);
        System.out.println("Number divided by 4 = " + divide);
    }
}