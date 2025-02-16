package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

public interface Subject {
    void addObserver();
    void removeObserver();
    void notifyObserver();
    String getName();
    int getStock();
    void setStock(int stock);
    void buy(Observer obj, int quantity);
}
