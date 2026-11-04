import java.util.ArrayList;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

class StudentManagementDemo {
    public static void main(String[] args) {
        ArrayList<Student<Integer, String, Double>> list =
            new ArrayList<>();

        list.add(new Student<>(101, "Aman", 85.5));
        list.add(new Student<>(102, "Rahul", 90.0));
        list.add(new Student<>(103, "Priya", 88.5));
        list.add(new Student<>(104, "Neha", 78.0));
        list.add(new Student<>(105, "Riya", 92.5));

        System.out.println("All Students:");
        for (Student<Integer, String, Double> s : list)
            s.display();

        System.out.println("Total Students: " + list.size());

        int searchId = 103;
        boolean found = false;

        for (Student<Integer, String, Double> s : list) {
            if (s.id.equals(searchId)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
            }
        }

        if (!found)
            System.out.println("Student Not Found");

        System.out.println("Type Safety: Integer ID, String Name, Double Marks");
    }
}