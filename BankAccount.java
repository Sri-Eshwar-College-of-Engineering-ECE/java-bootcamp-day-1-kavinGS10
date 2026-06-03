
class BankAccount {
    // Instance variable
    int balance;

    // Constructor
    BankAccount(int balance) {
        this.balance = balance;
    }

    // Method using local variable
    void deposit() {
        int depositAmount = 2000; // Local variable
        balance = balance + depositAmount;

        System.out.println("Current Balance: 10000");
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(10000);
        acc.deposit();
    }
}