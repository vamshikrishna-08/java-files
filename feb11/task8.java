class LogScanner extends Thread {  //Log Monitoring System (Thread States)
    private final int cycles;
    public LogScanner(int cycles) {
        this.cycles = cycles;
    }
    @Override
    public void run() {
        for (int i = 1; i <= cycles; i++) {
            System.out.println("LogScanner cycle " + i + " started.");
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                System.out.println("LogScanner interrupted.");
                return;
            }
            System.out.println("LogScanner cycle " + i + " completed.");
        }
    }
}
public class task8 {
    public static void main(String[] args) {
        LogScanner scanner = new LogScanner(3);
        System.out.println("Thread state before start: " + scanner.getState());
        scanner.start();
        try {
            scanner.join();  
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }
        System.out.println("Thread state after completion: " + scanner.getState());
        System.out.println("Log scanning finished.");
    }
}
