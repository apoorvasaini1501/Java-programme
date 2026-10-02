import java.util.Arrays;

class SortJaggedArray {
    public static void main(String[] args) {

        int[][] a = {
            {5, 2, 8},
            {9, 1},
            {7, 4, 6, 3}
        };

        for (int i = 0; i < a.length; i++)
            Arrays.sort(a[i]);

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
    }
}




Sorted jagged array:
2 5 8
1 9
3 4 6 7