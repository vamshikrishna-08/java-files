import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class task4{
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
            System.out.println(line);
            }    
        br.close();
        }
    }
}