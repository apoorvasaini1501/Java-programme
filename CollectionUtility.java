import java.util.*;

class CollectionsUtilityDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);

        Collections.sort(list);
        System.out.println("Sort: " + list);

        Collections.reverse(list);
        System.out.println("Reverse: " + list);

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Frequency: " +
                           Collections.frequency(list, 10));
    }
}