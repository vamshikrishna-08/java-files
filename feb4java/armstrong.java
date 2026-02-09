public class armstrong {
    public static void main(String[] args) {
        int number = 153;
        int originalnumber = number;
        int result = 0;
        while (originalnumber !=0){
            int remainder = originalnumber % 10 ;
            result += Math.pow(remainder, 3);
            originalnumber /= 10;
        }
        if (result == number){
            System.out.println(number + "is armstrong");
        } else {
            System.out.println(number + "is not ");
        }
    }
    
}
