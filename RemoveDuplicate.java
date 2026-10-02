import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];
        int[] b = new int[6];
        int n = 0;

        System.out.println("Enter 6 elements:");

        for (int i = 0; i < 6; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 6; i++) {

            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found)
                b[n++] = a[i];
        }

        System.out.println("Array without duplicates:");

        for (int i = 0; i < n; i++)
            System.out.print(b[i] + " ");
    }
}


Enter 6 elements:
1 2 2 3 1 4
Array without duplicates:
1 2 3 4