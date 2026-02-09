public class task9 {        //: Retry Mechanism
    public static void main(String[] args) {
        int retries  = 0;
        boolean success = false;
        while (retries < 3) {
            retries++ ;
            System.out.println("api call attempt " + retries);
            if (retries == 2) {
                success = true ;
                System.out.println("api call successful ");
                break;
            }else {
                System.out.println("api failed , retrying");
            }
        }
        if (!success) {
            System.out.println("api failed of 3 attempts");
        }
    }
    
}
