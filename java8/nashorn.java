import javax.script.*;
public class nashorn {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine =manager.getEngineByName("nashorn");
        if (engine == null) {
            System.out.println("nashorn engine not found");
            System.out.println("your java version is : " + System.getProperty("java version"));
            System.out.println("note : nashorn was removed in java 15 . use java 8-14 or add nashorn dependency.");
        } else {
            engine.eval("print('Hello from JavaScript')");
        }

    }
}    