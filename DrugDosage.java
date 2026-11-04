import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String s) {
        super(s);
    }
}

class DrugDosageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Patient name: ");
            String p = sc.nextLine();

            System.out.print("Drug name: ");
            String d = sc.nextLine();

            System.out.print("Dosage: ");
            int dose = Integer.parseInt(sc.nextLine());

            if (dose <= 0 || dose > 1000)
                throw new InvalidDosageException("Invalid dosage");

            System.out.println("Dosage validated for " + p);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input");
        }
        catch (InvalidDosageException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Dosage validation completed.");
        }
    }
}