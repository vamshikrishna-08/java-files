interface workable {
    void work ();
}
interface  eatable {
    void eat ();
}
class  human implements workable, eatable {
    @Override
    public  void work () {
        System.out.println("human working");
    } 
    @Override
    public void eat () {
        System.out.println("human eating");
    }
}
class robot implements workable {
    @Override
    public void work ( ) {
        System.out.println("robot working");
    }
}
public class workapp {
    public static void main(String[] args) {
        workable humanworker = new human();
        humanworker.work();
        eatable humaneater = new human();
        humaneater.eat();
        workable robotWorker = new robot();
        robotWorker.work();
    }
}