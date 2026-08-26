import java.util.Scanner;

class LogicalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first boolean value (true/false):");
        boolean a = sc.nextBoolean();

        System.out.println("Enter second boolean value (true/false):");
        boolean b = sc.nextBoolean();

        System.out.println("Enter logical operator (&, |, !):");
        char operator = sc.next().charAt(0);

        if (operator == '&') {
            System.out.println("Result: " + (a && b));
        } else if (operator == '|') {
            System.out.println("Result: " + (a || b));
        } else if (operator == '!') {
            System.out.println("Result: " + (!a));
        } else {
            System.out.println("Invalid logical operator.");
        }

        sc.close();
    }
}