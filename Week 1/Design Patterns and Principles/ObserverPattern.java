//Exercise 7
import java.util.*;
interface Observer {
    void update(String price);
}
class MobileApp implements Observer {
    public void update(String price) {
        System.out.println("Mobile App: " + price);
    }
}
class WebApp implements Observer {
    public void update(String price) {
        System.out.println("Web App: " + price);
    }
}
class StockMarket {
    List<Observer> observers = new ArrayList<>();
    void register(Observer o) {
        observers.add(o);
    }
    void notifyObservers(String price) {
        for (Observer o : observers)
            o.update(price);
    }
}
public class ObserverPattern{
    public static void main(String[] args) {
        StockMarket stock = new StockMarket();

        stock.register(new MobileApp());
        stock.register(new WebApp());

        stock.notifyObservers("Stock Price = ₹500");
    }
}