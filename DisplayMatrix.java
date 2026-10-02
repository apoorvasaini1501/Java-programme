import java.util.Scanner;

class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        System.out.println("Array elements:");
        for (int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
    }
}


Enter 5 integers:
10 20 30 40 50
Array elements:
10 20 30 40 50