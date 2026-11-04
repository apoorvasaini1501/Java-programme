import java.util.*;

class ListComparisonDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = 10; i <= 30; i += 10) {
            a.add(i);
            l.add(i);
        }

        a.add(40);
        l.add(40);

        a.remove(1);
        l.remove(1);

        System.out.println("ArrayList: " + a);
        System.out.println("LinkedList: " + l);

        System.out.println("ArrayList Get: " + a.get(1));
        System.out.println("LinkedList Get: " + l.get(1));

        System.out.println("ArrayList Size: " + a.size());
        System.out.println("LinkedList Size: " + l.size());

        System.out.println("ArrayList Iteration:");
        for (int n : a)
            System.out.println(n);

        System.out.println("LinkedList Iteration:");
        for (int n : l)
            System.out.println(n);
    }
}