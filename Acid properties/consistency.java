class consistency {
    static int balance = 500;

    public static void main(String[] args) {
        withdraw(600);
    }
    static void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Transaction Rejected! Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("Transaction Successful. Balance: " + balance);
        }
    }
}