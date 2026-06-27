//Exercise 4
interface PaymentProcessor {
    void processPayment();
}
class PayPalGateway {
    void makePayment() {
        System.out.println("Payment via PayPal");
    }
}
class PayPalAdapter implements PaymentProcessor {
    PayPalGateway gateway = new PayPalGateway();

    public void processPayment() {
        gateway.makePayment();
    }
}
public class AdapterPattern {
    public static void main(String[] args) {
        PaymentProcessor payment = new PayPalAdapter();
        payment.processPayment();
    }
}