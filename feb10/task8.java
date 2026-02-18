import java.util.*;   // Library Management System
class Book {
    private final String title, author;
    private boolean available = true;
    public Book(String title, String author) {
        this.title = title; this.author = author;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }
    public void issue() { available = false; }
    public void returned() { available = true; }
}
class Member {
    private final String name;
    private final List<Book> borrowed = new ArrayList<>();
    public Member(String name) { this.name = name; }
    public String getName() { return name; }
    public void borrowBook(Book b) throws Exception {
        if (!b.isAvailable()) throw new Exception("Book unavailable: " + b.getTitle());
        b.issue(); borrowed.add(b);
    }
    public void returnBook(Book b, int daysLate) {
        b.returned();
        borrowed.remove(b);
        if (daysLate > 0) System.out.println("Late fine for " + b.getTitle() + ": Rs." + (daysLate*10));
    }
    public void showBorrowedBooks() {
        if (borrowed.isEmpty()) System.out.println(name + " has no borrowed books.");
        else System.out.println(name + " borrowed: " + borrowed.stream().map(Book::getTitle).toList());
    }
}
public class task8 {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "Orwell");
        Book b2 = new Book("Hamlet", "Shakespeare");
        Book b3 = new Book("Java", "AuthorX");
        List<Book> books = new ArrayList<>(List.of(b1,b2,b3));
        books.sort(Comparator.comparing(Book::getTitle));
        System.out.println("Books sorted by title:");
        books.forEach(b -> System.out.println(b.getTitle()+" by "+b.getAuthor()));
        Member m1 = new Member("Alice");
        try { 
            m1.borrowBook(b1); 
            m1.borrowBook(b2); 
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
        m1.showBorrowedBooks();
        System.out.println("\nReturning book with late fine:");
        m1.returnBook(b1, 3);  
        m1.showBorrowedBooks();
        try { m1.borrowBook(b1); } catch (Exception e) { System.out.println(e.getMessage()); }
        m1.showBorrowedBooks();
    }
}
