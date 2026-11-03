class ElectricBill {
    int units;
    static int fixedCharge = 50;

    void calculate() {
        int bill = units * 5 + fixedCharge;
        System.out.println("Units: " + units);
        System.out.println("Total Bill: " + bill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();
        e.units = 100;
        e.calculate();
    }
}

Units: 100
Total Bill: 550