public class task1 { // Java Environment Verification Tool 
   public static void main(String[] args) {
       System.err.println("java version : " + System.getProperty("java.version"));
       System.out.println("jvm vendor : " + System.getProperty("java.vm.vendordd"));
       System.out.println("os name :" + System.getProperty("os.name "));   
       System.err.println("os architecture: "+ System.getProperty("os.arch"));
   }
}
