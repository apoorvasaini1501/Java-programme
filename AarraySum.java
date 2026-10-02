import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println("Sum = " + sum);
    }
}





Enter 5 integers:
10 20 30 40 50
Sum = 150