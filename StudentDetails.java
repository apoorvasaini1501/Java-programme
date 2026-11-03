class Student {
    String name;
    int age;
    static int count = 0;

    Student(String n, int a) {
        name = n;
        age = a;
        count++;
    }

    public static void main(String[] args) {
        String n = "Aman";
        int a = 20;
        Student s = new Student(n, a);

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Count: " + count);
    }
}



Name: Aman
Age: 20
Count: 1