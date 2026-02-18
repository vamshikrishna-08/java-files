import java.util.concurrent.*;
public class task5 {   //Producer-Consumer 
    public static void main(String[] args) {
        BlockingQueue<String> orderQueue = new ArrayBlockingQueue<>(5);
        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    String order = "Order-" + i;
                    orderQueue.put(order);
                    System.out.println("Produced: " + order);
                    Thread.sleep(500);
                }
                orderQueue.put("END"); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
            }
        };
        Runnable consumer = () -> {
            try {
                while (true) {
                    String order = orderQueue.take();
                    if (order.equals("END")) break;
                    System.out.println("Processing: " + order);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(producer);
        executor.execute(consumer);
        executor.shutdown();
    }
}
