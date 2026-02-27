import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class task7{
    public static void main(String[] args)  throws IOException {
        try(Scanner sc = new Scanner(System.in)){
         System.out.println("enter word to search : ");
         String word = sc.next();
         try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
                String line ;
                int lineNo = 1;  
                while ((line = br.readLine()) != null){
                if(line.contains(word)){
                    System.out.println("foundat line : " + lineNo);
                 }
                 lineNo++;
                 }
                 br.close();
                 sc.close();
                }    
        }
    }   
}
