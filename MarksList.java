import java.util.*;

class MarksListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.add(85);
        marks.add(95);

        System.out.println("First: " + marks.get(0));
        System.out.println("Middle: " + marks.get(2));
        System.out.println("Last: " + marks.get(4));
    }
}