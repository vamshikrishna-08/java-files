import java.io.File;
import java.io.IOException; //create a file s
public class task1 {
    public static void main(String[] args) throws IOException {
        File file = new File ("sample.txt");
        if (file.exists()) {
            System.out.println("file already exists");
        } else {
            file.createNewFile();
            System.out.println("file created");
        }
        System.out.println("absolute path : " + file.getAbsolutePath());
        System.out.println("file size : " + file.length() + "bytes");
    }
}