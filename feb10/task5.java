import java.util.*;
class Movie {
    private final String name;
    public Movie(String name) {  //Movie Ticket Booking System
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Theatre {
    private int seats;
    private final Movie movie;
    private final Map<String, Double> seatPrices = new HashMap<>();
    private final List<String> bookingHistory = new ArrayList<>();
    public Theatre(Movie movie, int seats) {
        this.movie = movie;
        this.seats = seats;
        seatPrices.put("Regular", 150.0);
        seatPrices.put("Premium", 250.0);
    }
    public synchronized boolean bookSeat(String user, String category) {
        if (seats > 0) {
            seats--;
            bookingHistory.add(user + " booked " + category + " seat for "
                    + movie.getName() + " (Rs." + seatPrices.get(category) + ")");
            return true;
        }
        return false;
    }
    public void showBookings() {
        bookingHistory.forEach(System.out::println);
    }
}
class BookingTask implements Runnable {
    private final Theatre theatre;
    private final String user;
    private final String category;
    public BookingTask(Theatre theatre, String user, String category) {
        this.theatre = theatre;
        this.user = user;
        this.category = category;
    }
    @Override
    public void run() {
        if (theatre.bookSeat(user, category)) {
            System.out.println(user + " booking successful");
        } else {
            System.out.println(user + " booking failed");
        }
    }
}
public class task5 {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception");
        Theatre theatre = new Theatre(movie, 3);
        Thread t1 = new Thread(new BookingTask(theatre, "Alice", "Premium"));
        Thread t2 = new Thread(new BookingTask(theatre, "Bob", "Regular"));
        Thread t3 = new Thread(new BookingTask(theatre, "Charlie", "Regular"));
        Thread t4 = new Thread(new BookingTask(theatre, "David", "Premium"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ignored) {}
        System.out.println("\nBooking History:");
        theatre.showBookings();
    }
}
