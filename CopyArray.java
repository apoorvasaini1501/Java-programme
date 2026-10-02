import java.util.Scanner;

class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int even = 0, odd = 0;

        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}




Enter 6 integers:
10 15 20 25 30 35
Even numbers = 3
Odd numbers = 3