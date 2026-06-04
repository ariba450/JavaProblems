class Wallet {
    private double balance;
    private int id;
    private static int counter = 1;

    Wallet() {
        this.balance = 15;
        this.id = counter++;
    }

    Wallet(double balance) {
        this.balance = balance;
        this.id = counter++;
    }

    int getId() {
        return id;
    }

    double getBalance() {
        return balance;
    }
}

public class WalletTask3 {
    public static void main(String[] args) {
        Wallet p1 = new Wallet();
        Wallet p2 = new Wallet(1000);

        System.out.println(p1.getId());
        System.out.println(p2.getId());
    }
}