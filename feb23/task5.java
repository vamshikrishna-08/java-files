import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class task5{
    public static void main(String[] args)  throws IOException {
       try( BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
            int count = 0;
            while (br.readLine() != null){
                count++;
            }
            br.close();
            System.out.println("total lines:" + count);
    }   }
}