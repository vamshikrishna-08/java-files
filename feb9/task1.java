public class task1 { // Student Management System
    private int id;
    private String name;
    private double marks;

    public task1(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public char calculateGrade() {
        if (this.marks >= 90) {
            return 'A';
        } else if (this.marks >= 75) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public static void main(String[] args) {
        task1 StudentObj = new task1(1, "Rahul", 85);
        System.out.println("Student: " + StudentObj.getName());
        System.out.println("Marks: " + StudentObj.getMarks());
        System.out.println("Grade: " + StudentObj.calculateGrade());
    }
}
