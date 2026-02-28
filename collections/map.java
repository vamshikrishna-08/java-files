import java.util.HashMap;
import java.util.Map;
public class map {
        public static void main(String[] args) {
        Map<Integer , String> hii = new HashMap<>();
        hii.put(101, "vamshi");
        hii.put(102, "rahul");
        hii.put(103, "vipul");
        System.out.println("hii (Map) : " + hii);
        hii.put(102, "value");
        System.out.println(hii);
        for (Map.Entry<Integer, String> entry : hii.entrySet()){
            System.out.println(entry.getKey() + "->>" + entry.getValue());
        }
        hii.put(null, "admin");
        hii.put(104, null);
        System.out.println(hii);
    }
    
}
