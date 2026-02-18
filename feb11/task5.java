class Inventory {   //Inventory Update System (Synchronization – Block Level)
    private int stock;
    public Inventory(int initialStock) {
        this.stock = initialStock;
    }
    public void updateStock(int amount, String updater) {
        synchronized (this) {
            stock += amount;
            System.out.println(updater + " updated stock. Current stock: " + stock);
        }
        System.out.println(updater + " logged the update.");
    }
    public int getStock() {
        return stock;
    }
}
class StockUpdater implements Runnable {
    private final Inventory inventory;
    private final int amount;
    private final String name;
    public StockUpdater(Inventory inventory, int amount, String name) {
        this.inventory = inventory;
        this.amount = amount;
        this.name = name;
    }
    @Override
    public void run() {
        inventory.updateStock(amount, name);
    }
}
public class task5 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(100);
        Thread t1 = new Thread(new StockUpdater(inventory, 50, "Updater-1"));
        Thread t2 = new Thread(new StockUpdater(inventory, -30, "Updater-2"));
        Thread t3 = new Thread(new StockUpdater(inventory, 20, "Updater-3"));
        t1.start();
        t2.start();
        t3.start();
    }
}
