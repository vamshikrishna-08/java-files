interface  Discount{  //ocp
    double getDiscount ();
}
class studentDiscount implements Discount{
    @Override
    public double getDiscount(){
        return 10;
    }
}
class EmployeeDiscount implements Discount{
    @Override
    public double getDiscount(){
        return 20;
    }
}
public class Discountapp {
    public static void main(String[] args) {
        Discount student = new studentDiscount();
        Discount employee = new EmployeeDiscount();
        System.err.println("student discount : " + student.getDiscount() + "%");
        System.err.println("employee discount : " + employee.getDiscount() + "%");
    }
}
