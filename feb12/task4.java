import java.util.concurrent.*;
public class task4 {   //Scheduled Cleanup Job (ScheduledExecutorService)
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable cleanupTask = () -> {
            System.out.println("Cleaning temporary files... " + System.currentTimeMillis());
        };
        scheduler.scheduleAtFixedRate(cleanupTask, 0, 5, TimeUnit.SECONDS);
        scheduler.schedule(() -> {
            System.out.println("Stopping cleanup job...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
