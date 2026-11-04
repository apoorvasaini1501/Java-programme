class NestedTryCatchDemo {
    public static void main(String[] args) {
        int a[] = {10, 20, 30};

        try {
            try {
                System.out.println(a[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index");
            }

            System.out.println(10 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}