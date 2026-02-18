import java.io.*;
import java.util.*;
class Product {  //inventory Management System
    private final int id;
    private final String name;
    private int stock;
    public Product(int id, String name, int stock) {
        if (stock < 0)
            throw new IllegalArgumentException("Stock cannot be negative");
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock < 0)
            throw new IllegalArgumentException("Stock cannot be negative");
        this.stock = stock;
    }
    @Override
    public String toString() {
        return id + " - " + name + " | Stock: " + stock;
    }
}
class task9 {  
    private final Map<Integer, Product> inventory = new HashMap<>();
    public void addProduct(Product p) {
        inventory.put(p.getId(), p);
    }
    public void updateStock(int id, int newStock) {
        Product p = inventory.get(id);
        if (p != null)
            p.setStock(newStock);
    }
    public void deleteProduct(int id) {
        inventory.remove(id);
    }
    public Product search(int id) {
        return inventory.get(id);
    }
    public List<Product> search(String name) {
        return inventory.values()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .toList();
    }
    public void generateReport() {
        inventory.values().forEach(System.out::println);
    }
    public void exportToFile(String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            inventory.values().forEach(writer::println);
        }
    }
    public static void main(String[] args) throws IOException {
        task9 system = new task9();
        system.addProduct(new Product(1, "Laptop", 10));
        system.addProduct(new Product(2, "Mouse", 25));
        system.addProduct(new Product(3, "Keyboard", 15));
        system.updateStock(1, 8);
        system.deleteProduct(2);
        System.out.println(system.search(1));
        System.out.println(system.search("Keyboard"));
        System.out.println("\nStock Report:");
        system.generateReport();
        system.exportToFile("stock_report.txt");
    }
}
