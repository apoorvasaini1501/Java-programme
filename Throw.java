import java.util.Scanner;

class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int m = sc.nextInt();

            if (m < 0 || m > 100)
                throw new ArithmeticException("Invalid marks");

            System.out.println("Marks = " + m);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}