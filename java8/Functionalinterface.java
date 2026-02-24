@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}
public class Functionalinterface {
    public static void main(String[] args) {
        Greeting g = name -> System.out.println("Hello " + name);
        g.sayHello("Java 8");
    }
}