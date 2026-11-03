class Employee {
    int empId;
    double salary;
    static String companyName = "Google";

    public static void main(String[] args) {
        int id = 101;
        double sal = 30000;
        Employee e = new Employee();
        e.empId = id;
        e.salary = sal;

        System.out.println("ID: " + e.empId);
        System.out.println("Salary: " + e.salary);
        System.out.println("Company: " + companyName);
    }
}

ID: 101
Salary: 30000.0
Company: Google