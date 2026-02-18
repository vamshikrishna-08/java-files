class Rectangle {  //Rectangle Area Calculator
    private final double length;
    private final double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
public class task3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Length: 10");
        System.out.println("Width: 5");
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
