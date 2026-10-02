import java.util.Scanner;

class TriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter matrix:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Upper triangular:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i <= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("Lower triangular:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i >= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}


Upper triangular:
1 2 3
0 5 6
0 0 9

Lower triangular:
1 0 0
4 5 0
7 8 9