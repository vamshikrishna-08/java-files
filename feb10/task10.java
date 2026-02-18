import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}
class Logger {  //Mini Framework (Advanced OOPS
    private static final Logger instance = new Logger();
    private Logger() {}
    public static Logger getInstance() {
        return instance;
    }
    public void log(String message) {
        System.out.println(message);
    }
}
interface Service {
    void execute();
}
class OrderService implements Service {
    @LogExecutionTime
    public void placeOrder() {
        try { Thread.sleep(200); } catch (InterruptedException ignored) {}
        System.out.println("Order placed");
    }
    public void cancelOrder() {
        System.out.println("Order cancelled");
    }
    @Override
    public void execute() {
        placeOrder();
        cancelOrder();
    }
}
class UserService implements Service {
    @LogExecutionTime
    public void createUser() {
        try { Thread.sleep(150); } catch (InterruptedException ignored) {}
        System.out.println("User created");
    }
    public void deleteUser() {
        System.out.println("User deleted");
    }
    @Override
    public void execute() {
        createUser();
        deleteUser();
    }
}
class Framework {
    public static void run(Service service) throws Exception {
        Method[] methods = service.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.currentTimeMillis();
                method.invoke(service);
                long end = System.currentTimeMillis();
                Logger.getInstance().log(
                        method.getName() + " executed in " + (end - start) + " ms"
                );
            }
        }
    }
}
public class task10 {
    public static void main(String[] args) throws Exception {
        Service orderService = new OrderService();
        Service userService = new UserService();
        Framework.run(orderService);
        Framework.run(userService);
    }
}
