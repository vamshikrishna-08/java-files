import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class predicate {
    public static void main (String[] args) {
      List<Integer> numbers  = Arrays.asList(10,15,30,44,21,12,23);
      Predicate<Integer> isGreater = n -> n > 20 ;
      List<Integer> filteredList = numbers.stream() 
                                          .filter(isGreater)
                                          .collect(Collectors.toList());
      System.out.println(filteredList);
    }
}
