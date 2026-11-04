class Employee<T, U> {
    T id;
    U name;

    Employee(T id, U name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class GenericEmployeeDemo {
    public static void main(String[] args) {
        Employee<Integer, String> e =
            new Employee<>(101, "Aman");

        e.display();
    }
}