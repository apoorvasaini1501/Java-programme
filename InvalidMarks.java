import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String s) {
        super(s);
    }
}

class InvalidMarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int m = sc.nextInt();

            if (m < 0 || m > 100)
                throw new InvalidMarksException("Invalid marks");

            System.out.println("Valid marks");
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}