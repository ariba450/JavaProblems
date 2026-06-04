class Main {
    
    static double deposit(double balance, double amount) {
        return balance + amount;
    }

    static double withdraw(double balance, double amount) {
        return balance - amount;
    }

    public static void main(String[] args) {
        double balance_1 = 1500;
        double balance_2 = 1000;

        balance_1 = deposit(balance_1, 100);
        balance_2 = withdraw(balance_2, 200);

        System.out.println("Balance 1: " + balance_1);
        System.out.println("Balance 2: " + balance_2);
    }
}