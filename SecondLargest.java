import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : a) {

            if (x > largest) {
                second = largest;
                largest = x;
            }
            else if (x > second && x != largest) {
                second = x;
            }
        }

        System.out.println("Second largest = " + second);
    }
}



Enter 5 elements:
10 25 15 40 30
Second largest = 30