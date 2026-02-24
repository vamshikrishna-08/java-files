import java.util.*;
public class optionalclass{
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Java");
        name.ifPresent(System.out::println);
        String value = name.orElse("Default");
        System.out.println(value);
    }
}