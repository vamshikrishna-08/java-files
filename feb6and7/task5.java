import java.util.HashMap;
import java.util.Map;
public class task5 {    //Application Error Codes Analyzer
    public static void main(String[] args) {
        String[] errorlogs = { "404", "500", "404", "403", "500","404", "408"};
        Map<String, Integer> counts = new HashMap<>();
        for (String code : errorlogs ) {
            counts.put(code, counts.getOrDefault(code, 0) + 1);           
        }System.out.println("error code counts :");
        String mostFrequent = null ;
        int maxcount = -1;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println("code " + entry.getKey()+" : " + entry.getValue()+ " times");
            if (entry.getValue()> maxcount){
                maxcount = entry.getValue();
                mostFrequent = entry.getKey();
            }            
        }
        System.out.println("\n Most frequent error code : " + mostFrequent + " (occured " + maxcount + "times)");
    }
}
