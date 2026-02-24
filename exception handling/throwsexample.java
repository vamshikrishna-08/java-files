import java.io.*;
public class throwsexample {
    public static void readFile() throws IOException {
        try (FileReader file = new FileReader("test.txt")){
        int data = file.read();
        System.out.println("file data : " + data);
        }
    }   
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or error reading file." + e.getMessage());
        }
    }
}