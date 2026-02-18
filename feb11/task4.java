class Account {  //Bank Transaction System (Synchronization – Method Level)
    private int balance;
    public Account(int initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void withdraw(int amount, String customerName) {
        if (balance >= amount) {
            System.out.println(customerName + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(customerName + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(customerName + " cannot withdraw " + amount + ". Insufficient balance: " + balance);
        }
    }
    public int getBalance() {
        return balance;
    }
}
class Customer implements Runnable {
    private final Account account;
    private final int amount;
    private final String name;
    public Customer(Account account, int amount, String name) {
        this.account = account;
        this.amount = amount;
        this.name = name;
    }
    @Override
    public void run() {
        account.withdraw(amount, name);
    }
}
public class task4 {
    public static void main(String[] args) {
        Account sharedAccount = new Account(1000); 
        Thread customer1 = new Thread(new Customer(sharedAccount, 400, "Customer-1"));
        Thread customer2 = new Thread(new Customer(sharedAccount, 700, "Customer-2"));
        Thread customer3 = new Thread(new Customer(sharedAccount, 300, "Customer-3"));
        customer1.start();
        customer2.start();
        customer3.start();
    }
}
