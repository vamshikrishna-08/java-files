import java.util.*;
public class lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++");
        list.forEach(name -> System.out.println(name));
    }
}