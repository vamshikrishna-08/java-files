class student {
    void calculateResult(){
     System.out.println("calculating result");
    }
}
class studentRepository {
    void save(student student) {
        System.out.println("saving student");
    }
}
class studentReport {
    void print(student student){
        System.out.println("printing report");
    }
}
public class studentapp{
    public static void main(String[] args) {
        student s = new student();
        s.calculateResult();
        studentRepository repo = new studentRepository();
        repo.save(s);
        studentReport report  = new studentReport();
        report.print(s);
    }
}