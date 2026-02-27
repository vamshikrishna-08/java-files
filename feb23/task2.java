import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class task2{
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"))){
        bw.write("java is powerful");
        bw.newLine();
        bw.write("file handling example");
        bw.newLine();
        bw.write("bufferedwriter used");
        bw.newLine();
        bw.write("overwrite mode");
        bw.newLine();
        bw.write("end of file");
        }   
        System.out.println("data written successfully");
    }
}