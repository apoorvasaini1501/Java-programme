import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String s) {
        super(s);
    }
}

class OnlineExamDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int m = Integer.parseInt(sc.nextLine());

            if (m < 0 || m > 100)
                throw new InvalidExamMarksException("Invalid marks");

            if (m >= 40)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid numeric marks");
        }
        catch (InvalidExamMarksException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exam evaluation completed.");
        }
    }
}