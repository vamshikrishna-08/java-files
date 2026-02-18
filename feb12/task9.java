import java.util.*;
import java.util.concurrent.*;
public class task9 {   //Parallel Report Generator (invokeAll)
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> reports = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            reports.add(() -> {
                Thread.sleep(1000); 
                return "Report-" + id + " generated";
            });
        }
        List<Future<String>> results = executor.invokeAll(reports);
        System.out.println("=== Report Summary ===");
        for (Future<String> f : results) {
            System.out.println(f.get());
        }
        executor.shutdown();
    }
}
