import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter matrix:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (a[i][j] == x) {
                    System.out.println("Found at row "
                            + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}


Enter element to search: 6
Found at row 2, column 3