import java.time.LocalTime;
class LoginTask extends Thread {  //Multi-User Login System (Thread Basics + Lifecycle)
    private final int userId;
    public LoginTask(int userId) {
        this.userId = userId;
    }
    @Override
    public void run() {
        System.out.println("User " + userId + " login started at " + LocalTime.now());
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println("Login interrupted for user " + userId);
        }
        System.out.println("User " + userId + " login successful");
    }
}
public class task1 {
    public static void main(String[] args) throws InterruptedException {
        LoginTask[] threads = new LoginTask[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new LoginTask(i + 1);
            System.out.println("Thread " + (i + 1) + " state before start: " + threads[i].getState());
        }
        for (LoginTask t : threads) {
            t.start();
        }
        for (LoginTask t : threads) {
            t.join();
            System.out.println("Thread state after execution: "
                    + t.getState());
        }
    }
}
