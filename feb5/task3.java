public class task3 { //Configuration Loader
    public static void main(String[] args) {
        int maxusers = 100;
        double threshold = 85.5;
        boolean isfeatureEnabled = true ;
        String environmentname = "production";
        System.out.println("environment: "+ environmentname);
        System.out.println("max users :" + maxusers);
        System.out.println("featureEnabled : "+ isfeatureEnabled);
        if (maxusers > threshold){
            System.out.println("warning : system limits (" + maxusers + ") exceed the allowed threshold (" + threshold + ")!");
        } 
     }
    
}
