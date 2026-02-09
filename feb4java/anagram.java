import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String s1 ="listen";
        String s2 = "silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char [] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)){
            System.err.println("anagram");
        }else{
            System.err.println("not an anagaram");
        }
    }
    
}
