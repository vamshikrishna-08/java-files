import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) throws Exception {
            student s = new student(101, "vamshi");
           try( ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("student.ser"))){
                oos.writeObject(s);
                oos.close();
                System.out.println("Object Serialized Successfully");
            }
    }          
}