import java.util.concurrent.*;
public class task10 {   //High Load Simulation System
    public static void main(String[] args) throws InterruptedException {
        int totalRequests = 100;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();
        for (int i = 1; i <= totalRequests; i++) {
            final int req = i;
            executor.execute(() -> {
                try { Thread.sleep(50); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                System.out.println("Processed request " + req + " by " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start) + " ms");
    }
}
