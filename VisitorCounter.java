import java.util.Scanner;

class VisitorCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int count = sc.nextInt();

        System.out.println("Visitors entering: " + (++count));
        System.out.println("Visitors leaving: " + (count--));
        System.out.println("Visitors remaining: " + count);
    }
}