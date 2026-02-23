public class task9 {   // camelcase
    public static void main(String[] args) {
        String s = "java string programs";
        String[] w = s.split(" ");
        String r = w[0];
        for(int i=1;i<w.length;i++)
            r += w[i].substring(0,1).toUpperCase() + w[i].substring(1);
        System.out.println(r);
    }
}
