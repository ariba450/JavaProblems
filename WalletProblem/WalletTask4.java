class Wallet {
    private double balance;
    private String LastMode;

    Wallet(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        this.balance -= amount;
        this.LastMode = "NORMAL";
    }

    void withdraw(double amount, String mode) {
        this.balance -= amount;
        this.LastMode = mode;
    }

    String getLastMode() {
        return LastMode;
    }

    double getBalance() {
        return balance;
    }
}

public class WalletTask4 {
    public static void main(String[] args) {
        Wallet p = new Wallet(500);

        p.withdraw(100);
        p.withdraw(50, "ATM");

        System.out.println(p.getBalance());
        System.out.println(p.getLastMode());
    }
}