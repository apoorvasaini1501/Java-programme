class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    void setEmployeeId(int id) { employeeId = id; }
    void setEmployeeName(String n) { employeeName = n; }

    void setSalary(double s) {
        if (s >= 0 && s <= 1000000)
            salary = s;
        else
            System.out.println("Invalid Salary");
    }

    void display() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(101);
        e.setEmployeeName("Rahul");
        e.setSalary(50000);
        e.setSalary(-500);
        e.display();
    }
}

Invalid Salary
ID: 101
Name: Rahul
Salary: 50000.0