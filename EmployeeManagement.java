import java.io.*;
import java.util.*;

class EmployeeManagementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("employees.txt");

            System.out.print("Enter ID, Name, Department, Salary: ");
            fw.write(sc.nextLine() + "\n");

            fw.close();

            System.out.print("Enter employee ID to search: ");
            String id = sc.nextLine();

            BufferedReader br = new BufferedReader(
                new FileReader("employees.txt"));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+");

                if (data[0].equals(id)) {
                    System.out.println("Employee Record: " + line);
                    found = true;
                    break;
                }
            }

            br.close();

            if (!found)
                System.out.println("Employee record not found.");
        }
        catch (IOException e) {
            System.out.println("File not found or file error");
        }
    }
}