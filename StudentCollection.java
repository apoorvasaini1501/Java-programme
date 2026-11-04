import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

class StudentCollectionDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        HashSet<Integer> ids = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        list.add(new Student(101, "Aman"));
        list.add(new Student(102, "Rahul"));
        list.add(new Student(103, "Priya"));
        list.add(new Student(104, "Neha"));
        list.add(new Student(105, "Riya"));

        for (Student s : list) {
            ids.add(s.id);
            sortedIds.add(s.id);
        }

        System.out.println("All Students:");
        for (Student s : list)
            s.display();

        System.out.println("Total: " + list.size());

        int search = 103;
        boolean found = false;

        for (Student s : list) {
            if (s.id == search) {
                System.out.println("Student Found:");
                s.display();
                found = true;
            }
        }

        if (!found)
            System.out.println("Student Not Found");

        list.removeIf(s -> s.id == 105);
        ids.remove(105);
        sortedIds.remove(105);

        System.out.println("After Removal: " + list.size());
        System.out.println("Unique IDs: " + ids);
        System.out.println("Sorted IDs: " + sortedIds);

        System.out.println("Forward Traversal:");
        ListIterator<Student> it = list.listIterator();

        while (it.hasNext())
            it.next().display();

        System.out.println("Backward Traversal:");
        while (it.hasPrevious())
            it.previous().display();
    }
}