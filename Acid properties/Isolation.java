class Isolation {
    static int balance = 1000;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> withdraw(300));
        Thread t2 = new Thread(() -> withdraw(500));
        t1.start();
        t2.start();
    }
    synchronized static void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Not enough balance");
        }
    }
}