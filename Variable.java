class Student {
    String name;
    int age;
    static int count = 0;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        String n = "Aman";
        int a = 20;
        Student s = new Student();
        s.name = n;
        s.age = a;
        s.display();
    }
}

Name: Aman
Age: 20
Count: 1