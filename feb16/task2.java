public class task2 {   //urlvalidator
    public static void main(String[] args) {
        String url = "https://google.com";
        if (url.startsWith("http://") || url.startsWith("https://"))
          System.out.println("valid url");
          else 
          System.out.println("invalid url"); 
    }
    
}
