import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String s) {
        super(s);
    }
}

class PatientAgeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120)
                throw new InvalidPatientAgeException("Invalid age");

            System.out.println("Registration successful: " + name);
        }
        catch (NumberFormatException e) {
            System.out.println("Enter numeric age");
        }
        catch (InvalidPatientAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}