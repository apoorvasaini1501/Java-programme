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

class StudentThreeParameterDemo {
    public static void main(String[] args) {
        Student<Integer, String, Double> s1 =
            new Student<>(101, "Aman", 85.5);

        Student<Integer, String, Double> s2 =
            new Student<>(102, "Rahul", 90.0);

        Student<Integer, String, Double> s3 =
            new Student<>(103, "Priya", 88.5);

        s1.display();
        s2.display();
        s3.display();
    }
}