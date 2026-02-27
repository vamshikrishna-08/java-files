import java.io.Serializable;
public class student implements Serializable {
    int id;
    String name ;
    student(int id, String name){
        this.id = id;
        this.name = name;
    }
}