public class task6 {        //Access Permission Validator
    public static void main(String[] args) {
        int age = 20;
        boolean hasvalidID = true;
        boolean hasactivesubscription = true;
        if (age >= 18 && hasvalidID && hasactivesubscription){
            System.out.println("acess granted");
        }else {
            System.out.println("acess denied");
        }
    }
    
}
