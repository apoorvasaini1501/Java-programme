class Temperature {
    double celsius;
    static String scale = "Celsius";

    void convert() {
        double f = (celsius * 9 / 5) + 32;
        double k = celsius + 273.15;

        System.out.println("Scale: " + scale);
        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.celsius = 25;
        t.convert();
    }
}

Scale: Celsius
Fahrenheit: 77.0
Kelvin: 298.15