import java.util.*;

class ListIteratorReportDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("HTML");
        list.add("CSS");

        ListIterator<String> it = list.listIterator();

        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("Next Index: " + it.nextIndex());
        }

        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
            System.out.println("Previous Index: " + it.previousIndex());
        }
    }
}