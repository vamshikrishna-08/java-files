class Engine {   //Car and Engine (Composition
    private final String type;    
    private final int horsepower; 
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
    public String getType() {
        return type;
    }
    public int getHorsepower() {
        return horsepower;
    }
}
class Car {
    private final String model;
    private final String color;
    private final Engine engine; 
    public Car(String model, String color, Engine engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Horsepower: " + engine.getHorsepower());
    }
}
public class task10 {
    public static void main(String[] args) {
        Engine engine = new Engine("V6", 300);
        Car car = new Car("Toyota Camry", "Red", engine);
        car.displayDetails();
    }
}
