class BankAccount {
    double balance;
    static String bankCode = "SBI01";

    void withdraw(double amount) {
        double remaining;

        if (amount <= balance) {
            remaining = balance - amount;
            balance = remaining;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.balance = 5000;
        b.withdraw(2000);
        System.out.println("Bank Code: " + bankCode);
    }
}


Withdrawal Successful
Balance: 3000.0
Bank Code: SBI01