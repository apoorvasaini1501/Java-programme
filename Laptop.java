class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    public static void main(String[] args) {
        String b = "HP";
        int r = 8;

        Laptop l = new Laptop();
        l.brand = b;
        l.RAM = r;

        System.out.println("Brand: " + l.brand);
        System.out.println("RAM: " + l.RAM + " GB");
        System.out.println("OS: " + os);
    }
}

Brand: HP
RAM: 8 GB
OS: Windows