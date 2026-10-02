import java.util.Scanner;

class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];
        boolean[] visited = new boolean[6];

        System.out.println("Enter 6 elements:");

        for (int i = 0; i < 6; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 6; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < 6; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}




Enter 6 elements:
2 3 2 4 3 2
2 occurs 3 times
3 occurs 2 times
4 occurs 1 times