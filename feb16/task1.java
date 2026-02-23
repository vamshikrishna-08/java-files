public class task1 {  //usernamegenerator
    public static void main (String[] args) {
        String name = "Kern Software Solutions" ;
        StringBuilder sb = new StringBuilder();
        for (String word : name.split(" ")){
            sb.append(word.substring(0, Math.min(3, word.length())).toLowerCase());
        }
        System.out.println(sb); 
    }
}