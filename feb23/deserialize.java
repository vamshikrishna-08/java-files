import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class deserialize {
    public static void main(String[] args) throws Exception {
       try(
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("student.ser"))){

        student s = (student) in.readObject();
        in.close();

        System.out.println("Object Deserialized Successfully");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        }
    }
}