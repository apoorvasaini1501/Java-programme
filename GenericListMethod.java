import java.util.ArrayList;

class GenericListMethodDemo {
    static <T> void display(ArrayList<T> list) {
        for (T x : list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        ArrayList<String> b = new ArrayList<>();
        b.add("Java");
        b.add("Python");

        display(a);
        display(b);
    }
}