class Wallet {
    private double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class WalletTask2{
    public static void main(String[] args) {
        Wallet p = new Wallet(1000);

        p.deposit(100);
        p.withdraw(150);

        System.out.println(p.getBalance());
    }
}
