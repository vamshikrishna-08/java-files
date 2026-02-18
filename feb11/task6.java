class TicketCounter {    //Ticket Booking System (Race Condition)
    private int tickets = 10;
    public void bookTicketUnsync(String user) {
        if (tickets > 0) {
            System.out.println(user + " booked a ticket. Remaining: " + (tickets - 1));
            tickets--;
        } else {
            System.out.println(user + " could not book. Tickets sold out!");
        }
    }
    public synchronized void bookTicketSync(String user) {
        if (tickets > 0) {
            System.out.println(user + " booked a ticket. Remaining: " + (tickets - 1));
            tickets--;
        } else {
            System.out.println(user + " could not book. Tickets sold out!");
        }
    }
    public int getTickets() {
        return tickets;
    }
}
class User implements Runnable {
    private final TicketCounter counter;
    private final String name;
    private final boolean sync;
    public User(TicketCounter counter, String name, boolean sync) {
        this.counter = counter;
        this.name = name;
        this.sync = sync;
    }
    @Override
    public void run() {
        if (sync) {
            counter.bookTicketSync(name);
        } else {
            counter.bookTicketUnsync(name);
        }
    }
}
public class task6 {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter counter = new TicketCounter();
        System.out.println("=== Booking WITHOUT Synchronization ===");
        Thread[] users1 = new Thread[5];
        for (int i = 0; i < 5; i++) {
            users1[i] = new Thread(new User(counter, "User-" + (i + 1), false));
            users1[i].start();
        }
        for (Thread t : users1) t.join();
        System.out.println("Tickets remaining: " + counter.getTickets());
        counter = new TicketCounter();
        System.out.println("\n=== Booking WITH Synchronization ===");
        Thread[] users2 = new Thread[5];
        for (int i = 0; i < 5; i++) {
            users2[i] = new Thread(new User(counter, "User-" + (i + 1), true));
            users2[i].start();
        }
        for (Thread t : users2) t.join();
        System.out.println("Tickets remaining: " + counter.getTickets());
    }
}
