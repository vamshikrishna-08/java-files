public class task7 {   //Deadlock Prevention Strategy
    private static final Object paymentLock = new Object();
    private static final Object inventoryLock = new Object();
    public static void processOrder() {
        synchronized (paymentLock) {
            System.out.println(Thread.currentThread().getName() + " locked Payment");
            synchronized (inventoryLock) {
                System.out.println(Thread.currentThread().getName() + " locked Inventory");
                System.out.println(Thread.currentThread().getName() + " Processing order...");
            }
        }
    }
    public static void main(String[] args) {
        Runnable task = task7::processOrder;
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();
    }
}
