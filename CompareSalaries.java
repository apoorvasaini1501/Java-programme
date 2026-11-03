class Employee {
    String name;
    double salary;
    static String organization = "ABC Company";

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Aman";
        e1.salary = 30000;

        e2.name = "Rahul";
        e2.salary = 40000;

        System.out.println("Organization: " + organization);

        if (e1.salary > e2.salary)
            System.out.println(e1.name + " has higher salary");
        else if (e2.salary > e1.salary)
            System.out.println(e2.name + " has higher salary");
        else
            System.out.println("Both salaries are equal");
    }
}


Organization: ABC Company
Rahul has higher salary