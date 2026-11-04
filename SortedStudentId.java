import java.util.*;

class SortedStudentIDDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(105);
        set.add(102);
        set.add(101);
        set.add(103);
        set.add(102);

        System.out.println("IDs: " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Higher: " + set.higher(102));
        System.out.println("Lower: " + set.lower(102));
    }
}