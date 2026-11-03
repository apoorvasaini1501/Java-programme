class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "SBI";

    void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 101;
        b.balance = 5000;
        b.deposit(2000);

        System.out.println("Account: " + b.accountNumber);
        System.out.println("Balance: " + b.balance);
        System.out.println("Bank: " + bankName);
    }
}

Account: 101
Balance: 7000.0
Bank: SBI