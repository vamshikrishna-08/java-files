interface  Bird {
    void move();   //lsp
}
interface flyingBird extends Bird {
    void fly ();
}
class sparrow implements flyingBird {
    @Override
    public  void fly() {
      System.out.println("sparrow is flying");
    }
    @Override
    public void move () {
        fly();
    }   
}    
class ostrich implements Bird{
     @Override
     public void move(){
        System.err.println("ostrich cannot fly");
     }
}     
public class Birdapp {
    public static void main(String[] args) {
        flyingBird sparrow = new sparrow();
        sparrow.fly();
        Bird ostrich = new ostrich();
        ostrich.move();
    }
}