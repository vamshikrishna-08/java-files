import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class task1 {  //API Request Processing System (Fixed Thread Pool)
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 20; i++) {
            int requestNumber = i;
            executor.submit(() -> {
                System.out.println(" API Request " + requestNumber +  " handled by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();
    }
}
