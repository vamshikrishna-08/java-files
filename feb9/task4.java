class Employee { //Inheritance – Employee Types
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
}
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
}
public class task4 {
    public static void main(String[] args) {
        Developer dev = new Developer("Rahul", 60000);
        System.out.println("Developer Details:");
        dev.displayDetails();
        System.out.println();
        Manager mgr = new Manager("Anita", 80000);
        System.out.println("Manager Details:");
        mgr.displayDetails();
    }
}
