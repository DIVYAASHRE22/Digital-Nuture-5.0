//Exercise 8
interface PaymentStrategy {
    void pay(int amount);
}
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
    }
}
class PaymentContext {
    private PaymentStrategy strategy;
    PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    void executePayment(int amount) {
        strategy.pay(amount);
    }
}
public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext p1 = new PaymentContext(new CreditCardPayment());
        p1.executePayment(1000);
        PaymentContext p2 = new PaymentContext(new PayPalPayment());
        p2.executePayment(2000);
    }
}