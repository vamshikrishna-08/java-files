class EmailService implements Runnable {   //Email Notification System (Async Processing)
    private final String email;
    public EmailService(String email) {
        this.email = email;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Email sending interrupted");
            return;
        }
        System.out.println("Email sent to: " + email);
    }
}
public class task10 {
    public static void main(String[] args) {
        String orderId = "ORD123";
        String customerEmail = "customer@example.com";
        System.out.println("Order " + orderId + " confirmed!");
        Thread emailThread = new Thread(new EmailService(customerEmail));
        emailThread.start();
        System.out.println("Main thread continues processing other tasks...");
    }
}
