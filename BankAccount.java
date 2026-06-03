
class BankAccount {
    
    int balance;

   
    BankAccount(int balance) {
        this.balance = balance;
    }

    
    void deposit() {
        int depositAmount = 2000; 
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
