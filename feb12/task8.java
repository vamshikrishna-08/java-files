import java.util.concurrent.*;
public class task8 {    //ATM Simulation Using ExecutorService
    static class Account {
        private int balance = 1000;
        public synchronized void withdraw(String user, int amount) {
            if (balance >= amount) {
                System.out.println(user + " withdrawing " + amount);
                balance -= amount;
                System.out.println(user + " completed. Remaining balance: " + balance);
            } else {
                System.out.println(user + " failed. Insufficient balance.");
            }
        }
    }
    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            final String user = "User-" + i;
            executor.execute(() -> {
                account.withdraw(user, 300);
            });
        }
        executor.shutdown();
    }
}
