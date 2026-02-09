public class task3 {  //Login Attempts Tracker
    public static void main(String[] args) {
        int[] loginAttempts = { 1, 4, 2 , 5 , 0 ,3};
        System.out.println("scanning system for security breaches...");
        for (int i = 0 ; i< loginAttempts.length ; i++){
          if (loginAttempts [i] > 3){
            System.out.println("alert :  user "  + i +   "has " + loginAttempts[i] + "failed attempts !");
          }
        }
    }
}
