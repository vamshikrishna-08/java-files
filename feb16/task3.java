public class task3 {  // csv to formatted op
    public static void main(String[] args) {
        String csv = "101 , Ravi ,50000";
        String[] data = csv.split(" ,");
        System.out.println("ID: " + data[0 ].trim()  
                             + " name: " + data[1].trim() 
                             + " salary: " + data[2].trim());
    }
}
