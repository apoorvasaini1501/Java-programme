class SimpleInterest {
    double principal, rate, time;
    static String bank = "SBI";

    void calculate() {
        double interest = (principal * rate * time) / 100;
        System.out.println("Interest: " + interest);
        System.out.println("Bank: " + bank);
    }

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        s.principal = 10000;
        s.rate = 5;
        s.time = 2;
        s.calculate();
    }
}


Interest: 1000.0
Bank: SBI