import java.util.Scanner;

class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }

        System.out.println("Matrix sum = " + sum);
    }
}



Enter 9 elements:
1 2 3 4 5 6 7 8 9
Matrix sum = 45