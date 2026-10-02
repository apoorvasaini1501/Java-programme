import java.util.Scanner;

class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int main = 0;
        int secondary = 0;

        System.out.println("Enter matrix:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            main += a[i][i];
            secondary += a[i][2 - i];
        }

        System.out.println("Main diagonal sum = " + main);
        System.out.println("Secondary diagonal sum = " + secondary);
    }
}



Main diagonal sum = 15
Secondary diagonal sum = 15