class Calculator {    //Method Overloading – Calculator
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class task5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(double, double): " + calc.add(5.5, 4.5));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
    }
}
