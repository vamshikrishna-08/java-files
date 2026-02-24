import java.util.*;
public class StreamApi{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}