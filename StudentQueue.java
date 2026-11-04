import java.util.*;

class StudentQueueDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Aman");
        list.addLast("Rahul");
        list.addLast("Priya");
        list.addFirst("Neha");

        System.out.println("Queue: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("After Removal: " + list);
    }
}