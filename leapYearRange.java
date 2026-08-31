import java.util.Scanner;

class LeapYearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= lower && year <= upper) {
            System.out.println("The year is a leap year and within the range.");
        } else {
            System.out.println("Condition is not satisfied.");
        }
    }
}