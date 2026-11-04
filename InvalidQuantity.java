import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String s) {
        super(s);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String s) {
        super(s);
    }
}

class PharmacyInventoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Medicine name: ");
            String name = sc.nextLine();

            System.out.print("Available quantity: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Required quantity: ");
            int r = Integer.parseInt(sc.nextLine());

            if (a < 0 || r < 0)
                throw new InvalidQuantityException("Negative quantity");

            if (r > a)
                throw new InsufficientMedicineStockException("Insufficient stock");

            System.out.println("Medicine issued: " + name);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input");
        }
        catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientMedicineStockException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}