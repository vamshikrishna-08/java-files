class Order implements Runnable {  //Order Processing System (Runnable vs Thread)
    private final int orderId;
    public Order(int orderId) {
        this.orderId = orderId;
    }
    @Override
    public void run() {
        try {
            validateOrder();
            processPayment();
            System.out.println(Thread.currentThread().getName() +  " - Order " + orderId + " completed\n");
        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " interrupted");
        }
    }
    private void validateOrder() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " - Validating order " + orderId);
        Thread.sleep(1000);
    }
    private void processPayment() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " - Processing payment for order " + orderId);
        Thread.sleep(1500);
    }
}
public class task2 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            Order order = new Order(i + 1);
            threads[i] = new Thread(order, "Order-Thread-" + (i + 1));
            threads[i].start();
        }
    }
}
