import java.util.*;
interface Employee {
    String getName();
    double calculateSalary();
}
class FullTimeEmployee implements Employee {  //Employee Payroll System
    private final String name;
    private final double salary;
    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double calculateSalary() {
        return salary;
    }
}
class PartTimeEmployee implements Employee {
    private final String name;
    private final int hours;
    private final double rate;
    public PartTimeEmployee(String name, int hours, double rate) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}
class ContractEmployee implements Employee {
    private final String name;
    private final double amount;
    public ContractEmployee(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double calculateSalary() {
        return amount;
    }
}
class PayrollSystem {
    private final List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee e) {
        employees.add(e);
    }
    public void generatePayrollReport() {
        for (Employee e : employees) {
            System.out.println(e.getName() + " : $" + e.calculateSalary());
        }
    }
}
public class task4 {
    public static void main(String[] args) {
        PayrollSystem ps = new PayrollSystem();
        ps.addEmployee(new FullTimeEmployee("Alice", 5000));
        ps.addEmployee(new PartTimeEmployee("Bob", 80, 25));
        ps.addEmployee(new ContractEmployee("Charlie", 3000));
        ps.generatePayrollReport();
    }
}
