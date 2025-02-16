package ObserverDesignPattern.Notification;

import ObserverDesignPattern.Observable.Subject;
import ObserverDesignPattern.Observer.Observer;

public class EmailNotification implements NotificationImpl {
    private Subject product;
    private Observer observer;

    public EmailNotification(Observer observer, Subject product) {
        this.observer = observer;
        this.product = product;
    }

    @Override
    public void send() {
        System.out.println("============= Email Notification =============");
        System.out.println("Email sent to: " + observer.getEmail());
        System.out.println("Hey " + observer.getName() + ", your product " + product.getName() + " is back in stock!");
        System.out.println("\n");
    }
}
