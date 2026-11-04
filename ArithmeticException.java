import java.util.Scanner;

class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result = " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}