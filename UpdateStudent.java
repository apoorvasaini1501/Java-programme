import java.util.*;

class UpdateStudentDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Aman");
        list.add("Rahul");
        list.add("Priya");
        list.add("Neha");

        list.set(1, "Rohan");
        list.remove(3);

        System.out.println(list);
    }
}