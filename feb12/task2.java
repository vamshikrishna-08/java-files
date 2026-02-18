import java.util.concurrent.*;
public class task2 {   //Banking Batch Processing (Callable + Future)
    public static void main(String[] args)  throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<Double> acc1 = ()-> 10000 * 0.05;
        Callable<Double> acc2 = ()-> 20000 * 0.05;
        Callable<Double> acc3 = ()-> 30000 * 0.05;
        Future<Double> f1 = executor.submit(acc1);
        Future<Double> f2 = executor.submit(acc2);
        Future<Double> f3 = executor.submit(acc3);
        System.out.println("Interest 1:" + f1.get());
        System.out.println("Interest 1:" + f2.get());
        System.out.println("Interest 1:" + f3.get());
    }
}