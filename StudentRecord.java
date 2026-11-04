import java.io.*;
import java.util.*;

class StudentRecordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter roll, name, course, marks: ");
                String record = sc.nextLine();
                fw.write(record + "\n");
            }

            fw.close();

            System.out.println("\nStudent Records:");

            BufferedReader br = new BufferedReader(
                new FileReader("student_records.txt"));

            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);

            br.close();
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}