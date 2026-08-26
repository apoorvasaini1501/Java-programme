import java.util.Scanner;

class HeightClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height in centimeters:");
        double height = sc.nextDouble();

        if (height < 150) {
            System.out.println("The person is Short.");
        } else if (height <= 170) {
            System.out.println("The person is Average.");
        } else {
            System.out.println("The person is Tall.");
        }

        sc.close();
    }
}