class Wallet {
    double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    static void addBonus(Wallet w, double amount) {
        w.balance += amount;
    }
}

public class WalletTask5 {
    public static void main(String[] args) {

        Wallet p1 = new Wallet(500);
        Wallet p2 = new Wallet(1000);

        Wallet.addBonus(p1, 100);

        System.out.println(p1.balance);

        Wallet temp = p1;
        p1 = p2;
        p2 = temp;

        System.out.println(p1.balance);
        System.out.println(p2.balance);
    }
}