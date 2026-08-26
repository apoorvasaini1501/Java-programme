import java.util.Scanner;
class Arithmetic {
  public static void main (String []args)
  {
    Scanner sc = new Scanner(System.in );
    System.out.println("enter a first number:");
    int a = sc.nextInt();
    System.out.println("enter a second number:");
    int b = sc.nextInt();
      System.out.println("Addition:"+ (a+b));
      System.out.println("Substraction:"+(a-b));
      System.out.println("Multiplication:"+(a*b));
      System.out.println("Division:"+(a/b));
      System.out.println("Modulus:"+(a%b));
  }
}
