import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String s) {
        super(s);
    }
}

class BankWithdrawalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            double b = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double w = Double.parseDouble(sc.nextLine());

            if (w < 0)
                throw new IllegalArgumentException("Negative amount");

            if (w > b)
                throw new InsufficientBalanceException("Insufficient balance");

            System.out.println("Remaining balance = " + (b - w));
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid numbers");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Bank transaction completed.");
        }
    }
}