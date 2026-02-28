import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<String> hii = new PriorityQueue<>();
        hii.offer("hell0");
        hii.offer("vamshi");
        hii.offer("rahul");
        hii.add("gud ");
        hii.add("mrng");
        System.out.println("hii (Queue) : " + hii);
        hii.poll();
        System.out.println("hii(Queue) :" + hii);
    }
    
}
