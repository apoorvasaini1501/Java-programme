import java.io.*;

class CreateWriteFileDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("Student Name: Aman\n");
            fw.write("Roll Number: 101\n");
            fw.write("Course: BCA\n");
            fw.write("Semester: 3");

            fw.close();
            System.out.println("File created and data written successfully.");
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}