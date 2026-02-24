import java.util.*;
public class parallelstream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.parallelStream()
               .forEach(System.out::println);
    }
}