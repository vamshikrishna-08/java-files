import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class task3 {
    public static void main(String[] args) throws IOException {
       try(BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt", true))){
        bw.newLine();
        bw.write("this line is appended");
        bw.close();
        System.out.println("data appended");
       }
    }
}