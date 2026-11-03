class Person {
    String name;
    int age;
    static String country = "India";

    void check() {
        boolean eligible = age >= 18;
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println(eligible ? "Eligible to vote" : "Not eligible");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Aman";
        p.age = 20;
        p.check();
    }
}


Name: Aman
Country: India
Eligible to vote