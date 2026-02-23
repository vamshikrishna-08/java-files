import java.util.*;
public class task5 {  //find repeated words
    public static void main(String[] args) {
        String text = "java is easy and java is powerful";
        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words )
           map.put(word, map.getOrDefault(word, 0 ) + 1);
        map.forEach((k, v ) -> {
            if (v > 1)
                System.out.println(k + " =  " + v);
        });
    }
}
