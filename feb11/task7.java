import java.util.Random;
class Payment implements Runnable {  //Payment Gateway Delay Simulation (sleep)
    private final String user;
    private static final Random rand = new Random();
    public Payment(String user) {
        this.user = user;
    }
    @Override
    public void run() {
        System.out.println(user + " payment started.");
        try {
            int delay = 1000 + rand.nextInt(2000); 
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println(user + " payment interrupted.");
        }
        System.out.println(user + " payment completed.");
    }
}
public class task7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Payment("User-1"));
        Thread t2 = new Thread(new Payment("User-2"));
        Thread t3 = new Thread(new Payment("User-3"));
        t1.start();
        t2.start();
        t3.start();
    }
}
