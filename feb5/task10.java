public class task10 {       //Batch Job Processo
    public static void main(String[] args) {
        int[] records = { 10 , -1 , 20 , 0 , 30};
        for ( int r : records ) {
            if(r == -1){
                System.out.println("invalid record skipped ");
                continue;
            }
            if (r == 0){
                System.out.println("critical error. job stopped");
                break;           
            }
            System.out.println("processed recod : "+ r);
        }
    }
}
