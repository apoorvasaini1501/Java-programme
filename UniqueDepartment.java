import java.util.*;

class UniqueDepartmentDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("CSE");
        set.add("BCA");
        set.add("IT");
        set.add("CSE");
        set.add("BCA");

        System.out.println(set);
    }
}