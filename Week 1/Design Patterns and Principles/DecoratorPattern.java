//Exercise 5
interface Notifier {
    void send();
}
class EmailNotifier implements Notifier {
    public void send() {
        System.out.println("Email sent");
    }
}
abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}
class SMSNotifierDecorator extends NotifierDecorator {
    SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        notifier.send();
        System.out.println("SMS sent");
    }
}
public class DecoratorPattern{
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifierDecorator(new EmailNotifier());
        notifier.send();
    }
}