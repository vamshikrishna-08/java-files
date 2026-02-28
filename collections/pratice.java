import java.util.*;
public class pratice{
    public static void main(String[] args){
        List<String> studentlist = new ArrayList<>();
        studentlist.add("vamshi");
         studentlist.add("rahul");
        studentlist.add("rahul");
        System.out.println("studentlist (List) : " + studentlist);
        
        Set<String> courses = new HashSet<>();
        courses.add("java");
        courses.add("python");
        courses.add("java");
        System.out.println("courses (Set) :" + courses);
        
        Queue<String> admissionQueue = new LinkedList<>();
        admissionQueue.add("vamshi");
        admissionQueue.add("rahul");
        admissionQueue.add("vipul");
        System.out.println("admissiomQueue (Queue): " + admissionQueue);
        System.out.println("first student processed : " + admissionQueue.poll());
        System.out.println("queue after processing : " + admissionQueue);

        Map<Integer , String> studentMap = new HashMap<>();
        studentMap.put(101, "vamshi");
        studentMap.put(102,"rahul");
        studentMap.put(103,"vipul");
        System.out.println("studentMap (Map) : " + studentMap);
        

        System.out.println("\n--------iterating collections ------");
        System.out.println("List :" );
        for(String s: studentlist){
            System.out.println(s);
        }

        System.out.println("Set");
        for(String c : courses){
            System.out.println(c);
        }

        System.out.println("Map");
        for(Map.Entry<Integer, String> entry : studentMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("Queue");
        for(String q : admissionQueue){
            System.out.println(q);
        }
    }
}