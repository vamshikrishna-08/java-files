import java.util.HashSet;
import java.util.Set;
public class task7 {        //Duplicate Transaction Detector
    public static void main(String[] args) {
        int[] transactions = {101, 205, 310, 101, 450, 205, 500, 310, 205};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int id : transactions) {
            if (!seen.add(id)) {
                duplicates.add(id);
            }
        }
        System.out.println("Duplicate Transaction IDs:");
        for (int id : duplicates) {
            System.out.println(id);
        }
    }
}

