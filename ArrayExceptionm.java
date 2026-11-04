import java.util.Scanner;

class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int i = sc.nextInt();
            System.out.println("Element = " + a[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}