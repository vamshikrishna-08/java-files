import java.io.FileReader ;
import java.io.IOException;
public class checked {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("non_existent_txt")){
            int data = file.read();
            System.out.println("file content first byte : " + data);
        } catch (IOException e){
           System.out.println("checked exception caught :  " + e.getMessage() );
        }
    }     
}