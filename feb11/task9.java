import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Account {  // Deadlock Scenario (Bank Transfer)
    private int balance;
    public final Lock lock = new ReentrantLock();
    public Account(int balance) { this.balance = balance; }
    public void deposit(int amount) { balance += amount; }
    public void withdraw(int amount) { balance -= amount; }
    public int getBalance() { return balance; }
}
class BankTransfer implements Runnable {
    private final Account from;
    private final Account to;
    private final int amount;
    public BankTransfer(Account from, Account to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
    @Override
    public void run() {
        while (true) {
            boolean gotFrom = from.lock.tryLock();
            boolean gotTo = to.lock.tryLock();
            if (gotFrom && gotTo) {
                try {
                    from.withdraw(amount);
                    to.deposit(amount);
                    System.out.println(Thread.currentThread().getName() + " transferred " + amount + ". Balances: A=" + from.getBalance() + ", B=" + to.getBalance());
                } finally {
                    to.lock.unlock();
                    from.lock.unlock();
                }
                break;
            }
            if (gotFrom) from.lock.unlock();
            if (gotTo) to.lock.unlock();
        }
    }
}
public class task9 {
    public static void main(String[] args) throws InterruptedException {
        Account A = new Account(1000);
        Account B = new Account(1000);
        Thread t1 = new Thread(new BankTransfer(A, B, 100), "T1");
        Thread t2 = new Thread(new BankTransfer(B, A, 200), "T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Balances: A=" + A.getBalance() + ", B=" + B.getBalance());
    }
}
