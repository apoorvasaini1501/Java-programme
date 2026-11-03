class Calculator {
    static int operationsCount = 0;

    void add(int a, int b) {
        int result = a + b;
        operationsCount++;
        System.out.println("Add: " + result);
    }

    void subtract(int a, int b) {
        int result = a - b;
        operationsCount++;
        System.out.println("Subtract: " + result);
    }

    void multiply(int a, int b) {
        int result = a * b;
        operationsCount++;
        System.out.println("Multiply: " + result);
    }

    void divide(int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            operationsCount++;
            System.out.println("Divide: " + result);
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 5);
        c.subtract(10, 5);
        c.multiply(10, 5);
        c.divide(10, 5);
        System.out.println("Operations: " + operationsCount);
    }
}


Add: 15
Subtract: 5
Multiply: 50
Divide: 2.0
Operations: 4