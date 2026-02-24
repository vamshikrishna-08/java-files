import java.time.*;
public class datetime{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(today);
        System.out.println(time);
        System.out.println(dateTime);
    }
}