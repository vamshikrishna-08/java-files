import java.io.*;
public class task8{
    public static void main(String[] args) {
       try(BufferedReader br = new BufferedReader(new FileReader("source.txt"));
           BufferedWriter bw = new BufferedWriter(new FileWriter("destinationd.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
            System.out.println("filed copied successfully");   
        } catch (IOException e){
            System.out.println("error : " + e.getMessage());
        }  
    }
 }
