import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class task3 { // Parallel File Processing
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            int fileNo = i;
            executor.execute(() -> {
                System.out.println("processing file " + fileNo + "by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();
    }
}
