import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        int choice;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("\n=== Admin Service Menu ===");
                System.out.println("1. Start Service");
                System.out.println("2. Stop Service");
                System.out.println("3. Restart Service");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Service started successfully.");
                    case 2 -> System.out.println("Service stopped successfully.");
                    case 3 -> System.out.println("Service restarted successfully.");
                    case 4 -> System.out.println("Exiting application...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
        }
    }
}