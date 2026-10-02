import java.util.Scanner;

class Display3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();

        System.out.println("3-D Array:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(a[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}



3-D Array:
1 2
3 4

5 6
7 8