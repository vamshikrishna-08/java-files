interface Vehicle {
    default void start() {
        System.out.println("Vehicle starting...");
    }
}
class Car implements Vehicle {}
public class defaultmethod {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}