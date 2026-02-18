import java.util.ArrayList;
class Product {  //Simple Shopping Cart
    private final String name;  
    private final double price;  
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
public class task8 {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(new Product("Laptop", 45000));
        cart.add(new Product("Mouse", 500));
        cart.add(new Product("Keyboard", 1500));
        double total = 0;
        System.out.println("Shopping Cart:");
        for (Product p : cart) {
            System.out.println(p.getName() + " - " + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Bill: " + total);
    }
}
