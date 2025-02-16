package ObserverDesignPattern.Notification;

import ObserverDesignPattern.Observable.Subject;
import ObserverDesignPattern.Observer.Observer;
import java.util.Scanner;

public class MobileNotification implements NotificationImpl {
    private Subject product;
    private Observer observer;

    public MobileNotification(Observer observer, Subject product) {
        this.observer = observer;
        this.product = product;
    }

    @Override
    public void send() {
        System.out.println("============= Mobile Notification =============");
        System.out.println("Notification sent to: " + observer.getPhone());
        System.out.println("Hey " + observer.getName() + ", your product " + product.getName() + " is back in stock!");
        System.out.println("\n");
    }
}
