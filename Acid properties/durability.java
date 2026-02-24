import java.io.FileWriter;
import java.io.IOException;

class durability {
    public static void main(String[] args) {
        try (
            FileWriter writer = new FileWriter("transaction.txt")){
            writer.write("Transaction Completed Successfully");
            writer.close();
            System.out.println("Data Saved Permanently.");
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }
}