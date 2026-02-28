import java.util.*;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(45);
        numbers.add(10);
        System.out.println("Treeset Elements : " + numbers);
        System.out.println(numbers.subSet(5,40));
        System.out.println(numbers.first()); 
        System.out.println(numbers.last());
        System.out.println("Treeset Elements : " + numbers);
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());

    }
    
}
