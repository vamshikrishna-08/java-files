public class task8 {  //extract file extension
    public static void main(String[] args) {
        String f = "photo.png";
        System.out.println(f.substring(f.lastIndexOf('.') + 1));
    }
}
