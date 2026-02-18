import java.util.*;
interface PaymentMethod {   //Payment Gateway Simulation
    boolean pay(double amount);
}
class UPIPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI");
        return true;
    }
}
class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs." + amount + " via Credit Card");
        return true;
    }
}
class NetBankingPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs." + amount + " via NetBanking");
        return true;
    }
}
class PaymentFactory {
    public static PaymentMethod getPayment(String type) {
        return switch (type.toUpperCase()) {
            case "UPI" -> new UPIPayment();
            case "CREDIT" -> new CreditCardPayment();
            case "NETBANKING" -> new NetBankingPayment();
            default -> null;
        };
    }
}
public class task7 {
    private static final List<String> transactionLog = new ArrayList<>();
    public static void main(String[] args) {
        String[] types = {"UPI", "Credit", "NetBanking"};
        double[] amounts = {500, 1500, 800};
        for (int i = 0; i < types.length; i++) {
            PaymentMethod payment = PaymentFactory.getPayment(types[i]);
            if (payment != null && payment.pay(amounts[i])) {
                transactionLog.add("Success: " + types[i] + " Rs." + amounts[i]);
            } else {
                transactionLog.add("Failed: " + types[i] + " Rs." + amounts[i]);
            }
        }
        System.out.println("\nTransaction Log:");
        transactionLog.forEach(System.out::println);
    }
}
