class Pen {
    String color, type;
    static String manufacturer = "Cello";

    public static void main(String[] args) {
        String c = "Blue";
        String t = "Ball Pen";

        Pen p = new Pen();
        p.color = c;
        p.type = t;

        System.out.println("Color: " + p.color);
        System.out.println("Type: " + p.type);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

Color: Blue
Type: Ball Pen
Manufacturer: Cello