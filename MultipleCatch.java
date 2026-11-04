import java.util.Scanner;

class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Division = " + (x / y));

            System.out.print("Enter index: ");
            int i = sc.nextInt();

            System.out.println("Element = " + a[i]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}