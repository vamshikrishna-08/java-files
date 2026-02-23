import java.util.*;
public class task6 {  //otp verification
    public static void main(String[] args) {
        int otp = new Random().nextInt(9000) + 1000;
      try ( Scanner sc = new Scanner(System.in)){
        System.out.println("OTP: " + otp);
        System.out.print("Enter OTP: ");
        System.out.println(sc.nextInt() == otp ? "Verified" : "Invalid");
        sc.close();  
      }    
    }
}

