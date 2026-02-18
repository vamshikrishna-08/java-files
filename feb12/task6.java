import java.util.concurrent.*;
public class task6 {   //Custom ThreadPoolExecutor Configuration
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10, TimeUnit.SECONDS,  
                new ArrayBlockingQueue<>(5) 
        );
        for (int i = 1; i <= 30; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Executing Task " + taskId +  " | Active Threads: " + executor.getActiveCount() +  " | Queue Size: " + executor.getQueue().size());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();
    }
}
