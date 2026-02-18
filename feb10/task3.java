import java.util.*;
abstract class Vehicle {
    private final int id;
    private final String model;
    private boolean available = true;
    public Vehicle(int id, String model) {   //Vehicle Rental System
        this.id = id;
        this.model = model;
    }
    public int getId() {
        return id;
    }
    public boolean isAvailable() {
        return available;
    }
    public void rent() {
        available = false;
    }
    public void returnVehicle() {
        available = true;
    }

    public String getModel() {
        return model;
    }
    public abstract double calculateRentalPrice(int days);
}
class Car extends Vehicle {
    public Car(int id, String model) {
        super(id, model);
    }
    @Override
    public double calculateRentalPrice(int days) {
        return days * 50.0;
    }
}
class Bike extends Vehicle {
    public Bike(int id, String model) {
        super(id, model);
    }
    @Override
    public double calculateRentalPrice(int days) {
        return days * 20.0;
    }
}
class Truck extends Vehicle {
    public Truck(int id, String model) {
        super(id, model);
    }
    @Override
    public double calculateRentalPrice(int days) {
        return days * 80.0;
    }
}
class RentalSystem {
    private final List<Vehicle> vehicles = new ArrayList<>();
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public synchronized Vehicle rentVehicleById(int id) {
        for (Vehicle v : vehicles) {
            if (v.getId() == id && v.isAvailable()) {
                v.rent();
                return v;
            }
        }
        return null;
    }
}
class BookingTask implements Runnable {
    private final RentalSystem rentalSystem;
    private final int vehicleId;
    private final String customerName;
    public BookingTask(RentalSystem rentalSystem, int vehicleId, String customerName) {
        this.rentalSystem = rentalSystem;
        this.vehicleId = vehicleId;
        this.customerName = customerName;
    }
    @Override
    public void run() {
        Vehicle vehicle = rentalSystem.rentVehicleById(vehicleId);
        if (vehicle != null) {
            System.out.println(customerName + " successfully rented "
                    + vehicle.getModel());
        } else {
            System.out.println(customerName + " failed to rent vehicle ID "
                    + vehicleId);
        }
    }
}
public class task3 {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        rentalSystem.addVehicle(new Car(1, "Toyota"));
        rentalSystem.addVehicle(new Bike(2, "Yamaha"));
        rentalSystem.addVehicle(new Truck(3, "Volvo"));
        Thread t1 = new Thread(new BookingTask(rentalSystem, 1, "Alice"));
        Thread t2 = new Thread(new BookingTask(rentalSystem, 1, "Bob"));
        Thread t3 = new Thread(new BookingTask(rentalSystem, 2, "Charlie"));
        t1.start();
        t2.start();
        t3.start();
    }
}
