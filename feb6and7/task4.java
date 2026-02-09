public class task4 {        //Salary Increment Calculator
   public static void main(String[] args) {
       double[] salaries = { 500000, 650000, 45000, 70000, 80000, 55000};
       System.out.println("updating salaries with a 10% hike...");
       for (int i = 0; i< salaries.length; i++){
           salaries[i] = salaries[i] * 1.10;
       }
       System.out.println("updated salaries :");
       for (double s : salaries){
        System.out.printf("$%.2f %n", s);
       }
   }    
}
