class Car {
    String brand;
    int mileage;
    static int wheels = 4;

    public static void main(String[] args) {
        String b = "BMW";
        int m = 20;

        Car c = new Car();
        c.brand = b;
        c.mileage = m;

        System.out.println("Brand: " + c.brand);
        System.out.println("Mileage: " + c.mileage);
        System.out.println("Wheels: " + wheels);
    }
}

Brand: BMW
Mileage: 20
Wheels: 4