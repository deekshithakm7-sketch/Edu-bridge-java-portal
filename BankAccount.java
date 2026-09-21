public class BankAccount {
    String account_holder_name;
    double balance;

    void Deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void Withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void CheckBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.account_holder_name = "Rahul";
        b.balance = 5000;

        System.out.println("Account Holder: " + b.account_holder_name);

        b.CheckBalance();
        b.Deposit(2000);
        b.CheckBalance();
        b.Withdraw(1000);
        b.CheckBalance();
    }
}

