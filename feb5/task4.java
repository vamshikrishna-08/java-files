public class task4 {  //Type Casting in Billing System
    public static void main(String[] args) {
        double receivedamount = 199.99;
        int storedamount = (int) receivedamount;
        double implicitbacktodouble = storedamount;
        double precisionloss = receivedamount -  storedamount;
        System.out.println("--- Billing system log ---");
        System.out.println("original amount (double) :" + receivedamount);
        System.out.println("storedamount (int) :" + storedamount);
        System.out.println("precision loss : " + precisionloss);
        System.out.println("implict cast value : " + implicitbacktodouble);
    }
}
