import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++)
            a[i] = sc.nextInt();

        System.out.println("Reverse order:");
        for (int i = 9; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
}




 Enter 10 integers:
1 2 3 4 5 6 7 8 9 10
Reverse order:
10 9 8 7 6 5 4 3 2 1