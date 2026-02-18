import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

abstract class BankAccount { // Banking Management System
    private double balance;
    protected final int accountNumber;
    protected final ArrayList<String> transactions = new ArrayList<>();

    public BankAccount(int accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        transactions.add("Account opened with balance: " + initialBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public void printTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions) {
            System.out.println(" - " + t);
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (amount > getBalance()) {
            throw new InsufficientBalanceException("Savings account cannot be overdrawn");
        }
        setBalance(getBalance() - amount);
        transactions.add("Withdrawn: " + amount);
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (getBalance() - amount < -OVERDRAFT_LIMIT) {
            throw new InsufficientBalanceException("Overdraft limit exceeded");
        }
        setBalance(getBalance() - amount);
        transactions.add("Withdrawn: " + amount);
    }
}

public class task1 {
    private static final HashMap<Integer, BankAccount> accounts = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Banking Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1 -> createAccount();
                    case 2 -> deposit();
                    case 3 -> withdraw();
                    case 4 -> checkBalance();
                    case 5 -> showTransactions();
                    case 6 -> {
                        System.out.println("Thank you!");
                        return;
                    }
                    default -> System.out.println("Invalid option");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Transaction failed: " + e.getMessage());
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists");
            return;
        }
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Account Type (1 = Savings, 2 = Current): ");
        int type = sc.nextInt();
        BankAccount account = switch (type) {
            case 1 -> new SavingsAccount(accNo, balance);
            case 2 -> new CurrentAccount(accNo, balance);
            default -> {
                System.out.println("Invalid account type");
                yield null;
            }
        };
        if (account != null) {
            accounts.put(accNo, account);
            System.out.println("Account created successfully");
        }
    }

    private static void deposit() {
        BankAccount acc = getAccount();
        if (acc == null)
            return;
        System.out.print("Amount to deposit: ");
        double amount = sc.nextDouble();
        acc.deposit(amount);
        System.out.println("Deposit successful");
    }

    private static void withdraw() throws InsufficientBalanceException {
        BankAccount acc = getAccount();
        if (acc == null)
            return;
        System.out.print("Amount to withdraw: ");
        double amount = sc.nextDouble();
        acc.withdraw(amount);
        System.out.println("Withdrawal successful");
    }

    private static void checkBalance() {
        BankAccount acc = getAccount();
        if (acc != null) {
            System.out.println("Current Balance: " + acc.getBalance());
        }
    }

    private static void showTransactions() {
        BankAccount acc = getAccount();
        if (acc != null) {
            acc.printTransactions();
        }
    }

    private static BankAccount getAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        BankAccount acc = accounts.get(accNo);
        if (acc == null) {
            System.out.println("Account not found");
        }
        return acc;
    }
}