import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class task6{
    public static void main(String[] args)  throws IOException {
       try( BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
        String line;    
        int words = 0;
            while ((line = br.readLine()) != null){
                String[] arr = line.split(" ");
                words += arr.length;
            }
            br.close();
            System.out.println("total words:" + words);
        }
    }
}       