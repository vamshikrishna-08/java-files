class Atomicity {
    static int balance = 1000;

    public static void main(String[] args) {
        System.out.println("Initial Balance: " + balance);
        transfer(200);
        System.out.println("Final Balance: " + balance);
    }

    static void transfer(int amount) {
        try {
            balance -= amount;  
            if (amount > 150) { 
                throw new Exception("Transaction Failed!");
            }
            balance += amount;  
        } catch (Exception e) {
            balance += amount; 
            System.out.println(e.getMessage());
        }
    }
}