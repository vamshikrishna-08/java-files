import java.util.*;
interface Product {
    String getName();
    double getPrice();
}
class Electronics implements Product {   //E-Commerce Cart System
    private final String name;
    private final double price;
    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
class Clothing implements Product {
    private final String name;
    private final double price;
    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
class Groceries implements Product {
    private final String name;
    private final double price;
    public Groceries(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
interface DiscountStrategy {
    double applyDiscount(double totalAmount);
}
class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;
    }
}
class PercentageDiscount implements DiscountStrategy {
    private final double percentage;
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - (totalAmount * percentage / 100);
    }
}
class FlatDiscount implements DiscountStrategy {
    private final double amount;
    public FlatDiscount(double amount) {
        this.amount = amount;
    }
    @Override
    public double applyDiscount(double totalAmount) {
        return Math.max(0, totalAmount - amount);
    }
}
class Cart {
    private final List<Product> products = new ArrayList<>();
    private DiscountStrategy discountStrategy = new NoDiscount();
    public void addProduct(Product product) {
        products.add(product);
    }
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    public double calculateTotal() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
    public double calculateFinalAmount() {
        return discountStrategy.applyDiscount(calculateTotal());
    }
    public void sortProductsByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }
    public void displayProducts() {
        products.forEach(p ->
                System.out.println(p.getName() + " - $" + p.getPrice())
        );
    }
}
public class task2 {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Electronics("Laptop", 1200));
        cart.addProduct(new Clothing("T-Shirt", 30));
        cart.addProduct(new Groceries("Apples", 5));
        cart.addProduct(new Electronics("Headphones", 150));
        cart.sortProductsByPrice();
        System.out.println("Products in Cart:");
        cart.displayProducts();
        cart.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("\nTotal Amount: $" + cart.calculateTotal());
        System.out.println("After 10% Discount: $" + cart.calculateFinalAmount());
        cart.setDiscountStrategy(new FlatDiscount(100));
        System.out.println("After $100 Flat Discount: $" + cart.calculateFinalAmount());
    }
}
