import java.io.*;
import java.util.*;

class AppendFileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("students.txt", true);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            fw.write("\nName: " + name + ", Roll: " +
                     roll + ", Marks: " + marks);

            fw.close();
            System.out.println("Record appended successfully.");
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}