class Book {   //Library Book Issue
    private final String title;
    private boolean isIssued;    
    public Book(String title) {
        this.title = title;
        this.isIssued = false; 
    }
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued!");
        }
    }
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued!");
        }
    }
    public String getTitle() {
        return title;
    }
    public boolean isIssued() {
        return isIssued;
    }
}
public class task9 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        book1.issueBook();   
        book1.issueBook();   
        book1.returnBook();  
        book1.returnBook();  
    }
}
