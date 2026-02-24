public class trycatchfinally {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Exception Message: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
