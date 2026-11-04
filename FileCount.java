import java.io.*;

class FileCountDemo {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("data.txt"));

            String s;
            while ((s = br.readLine()) != null) {
                lines++;
                chars += s.length();

                if (!s.trim().isEmpty())
                    words += s.trim().split("\\s+").length;
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}