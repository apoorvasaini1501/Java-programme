import java.util.ArrayList;

class GenericStringListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Aman");
        list.add("Rahul");
        list.add("Priya");
        list.add("Neha");
        list.add("Riya");

        System.out.println(list);
        System.out.println("Get: " + list.get(1));

        list.set(1, "Rohan");
        System.out.println("Set: " + list);

        list.remove("Priya");
        System.out.println("Remove: " + list);

        System.out.println("Size: " + list.size());
    }
}