class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    void calculate() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product: " + name);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.id = 1;
        p.name = "Laptop";
        p.price = 50000;
        p.calculate();
    }
}

Product: Laptop
Discount: 5000.0
Final Price: 45000.0