import java.util.*;

class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String s = it.next();

            if (s.equals("Python")) {
                it.set("HTML");
                it.add("CSS");
            }
        }

        System.out.println(list);
    }
}